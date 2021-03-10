
result_chain = iter([False, False, True])


def test_reruns():
    assert next(result_chain), "Still failed"
