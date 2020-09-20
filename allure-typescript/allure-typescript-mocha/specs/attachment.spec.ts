import { allure } from "allure-mocha/runtime";
import { ContentType } from "allure-js-commons";

describe("Allure attachment", () => {
  it("provide some extra info to your test", () => {
    allure.attachment(
      "Text attachment name",
      "Content? Content!!1",
      ContentType.TEXT
    );
  });
});
