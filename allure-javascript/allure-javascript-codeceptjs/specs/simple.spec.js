/*eslint new-cap: ["error", { "capIsNew": false }]*/
Feature("Buildin allure for spec in js");

Scenario("Simple passed test", I => {
  I.passedStep();
});

Scenario("Simple failed test", I => {
  I.passedStep();
  I.failedStep();
});
