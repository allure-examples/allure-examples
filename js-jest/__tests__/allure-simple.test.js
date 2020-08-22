describe("test", () => {
  test("Allure simple test", () => {
    allure.step("Simple step", () => {});
    allure.step("Simple parent step", () => {
      allure.step("Simple nested step", () => {});
    });
    externalStep("step parameter");
  });
});

const externalStep = param =>
  allure.step("External Step", () => {
    allure.step(`External step parameter: ${param}`, () => {});
    allure.step("Simple step inside test method", () => {});
  });
