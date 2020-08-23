const allure: any = codeceptjs.container.plugins('allure');

Feature('Buildin allure for ts');

Scenario('Passed test with labels', (I) => {
  allure.feature("Feature example");
  allure.addLabel("owner", "eroshenkoam");
  I.passedStep();
});
