import { allure } from "allure-mocha/runtime";

describe("Allure label", () => {
  beforeEach("Set epic for test group", () => {
    allure.epic("Test epic");
  });
  it("marks test for BDD style", () => {
    allure.feature("Test feature");
    allure.story("Test Story");
  });
});
