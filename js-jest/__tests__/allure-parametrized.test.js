describe("test", () => {
  test.each([["First name"], ["Second name"]])(
    "Allure simple parametrized test",
    param => {
      allure.parameter("param", param);
      allure.step("Step inside parameterized test", () => {});
      allure.step(`Test parameter: ${param}`, () => {});
    }
  );
});
