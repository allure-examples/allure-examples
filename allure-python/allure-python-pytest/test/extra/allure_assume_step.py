from contextlib import suppress
from functools import wraps

import allure
import pytest
from _pytest.outcomes import Skipped


def assume_step(title, exception=None):
    """
    Allows you to suppress exception within the Allure steps.
    Depending on the type of allowed exception, step will receive different statuses -
    - Skipped if suppress Skipped (from pytest.skip())
    - Failed if suppress AssertionError
    - Broken if other
    """
    if callable(title):
        return AssumeStepContext(title.__name__, exception)(title)
    else:
        return AssumeStepContext(title, exception)


class AssumeStepContext:
    def __init__(self, title, exception=None):
        self.title = title
        self.exceptions = (Skipped, exception) if exception else Skipped
        self.allure_cm = allure.step(title)
        self.suppress = suppress(self.exceptions)

    def __call__(self, f):
        @wraps(f)
        def decorator(*args, **kwargs):
            with self.suppress:
                return allure.step(self.title)(f)(*args, **kwargs)

        return decorator

    def __enter__(self):
        return self.allure_cm.__enter__()

    def __exit__(self, exc_type, exc_val, exc_tb):
        self.allure_cm.__exit__(exc_type, exc_val, exc_tb)
        return self.suppress.__exit__(exc_type, exc_val, exc_tb)


def test_allure_steps():
    with assume_step('Skipped step'):
        pytest.skip('Some skip reason')
    with assume_step('Failed step', AssertionError):
        raise AssertionError('Some failed check')
    with assume_step('Broken step', ValueError):
        raise ValueError('Some broken exception')
    skipped_decorated_step()


@assume_step("Skipped decorated step")
def skipped_decorated_step():
    pytest.skip('Some skip reason')
