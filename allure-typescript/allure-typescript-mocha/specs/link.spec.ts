import { allure } from "allure-mocha/runtime";

describe("Allure link", () => {
  it("add useful links to test", () => {
    allure.link("http://qameta.io", "Qameta site");
    allure.issue(
      "issue-12",
      "https://github.com/allure-examples/allure-examples/issues/12"
    );
  });
});
