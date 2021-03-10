import unittest

import allure


class TestUnittest(unittest.TestCase):

    def setUp(self) -> None:
        with allure.step("Step in precondition"):
            pass

    def test_example(self):
        with allure.step("Step in test case"):
            self.assertTrue(True)

    @unittest.skip("Some skip reason")
    def test_skipped(self):
        pass

    def test_subtest(self):
        with self.subTest("First subtest"):
            pass
        with self.subTest("Second subtest"):
            pass

    def tearDown(self) -> None:
        with allure.step("Step in post condition"):
            pass
