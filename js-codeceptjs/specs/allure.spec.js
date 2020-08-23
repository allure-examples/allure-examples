/*eslint new-cap: ["error", { "capIsNew": false }]*/
const allure = codeceptjs.container.plugins("allure");

Feature("Buildin allure for js-spec");

Scenario("Passed test with labels", I => {
  allure.feature("Feature example");
  allure.addLabel("owner", "eroshenkoam");
  I.passedStep();
});
