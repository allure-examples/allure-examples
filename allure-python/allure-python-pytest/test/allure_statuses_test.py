import pytest


def test_passed():
    pass


def test_failed():
    assert False, "Some fail reason"


def test_broken():
    var = 1 / 0
    assert var


@pytest.skip("Some skip reason")
def test_skipped():
    pass


@pytest.xfail("Some xfail reason")
def test_xfail():
    assert False, "Assertion failed"


@pytest.xfail("Test doesn't fail")
def test_xpass():
    pass
