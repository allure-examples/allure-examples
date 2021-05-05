import pytest


def test_passed():
    pass


def test_failed():
    assert False, "Some fail reason"


def test_broken():
    var = 1 / 0
    assert var


@pytest.mark.skip(reason="Some skip reason")
def test_skipped():
    pass


@pytest.mark.xfail(reason="Some xfail reason")
def test_xfail():
    assert False, "Assertion failed"


@pytest.mark.xfail(reason="Test doesn't fail")
def test_xpass():
    pass
