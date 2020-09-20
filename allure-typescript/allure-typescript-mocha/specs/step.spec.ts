import { allure } from "allure-mocha/runtime";
import { expect } from "chai";

const commonStep = () =>
  allure.step("External step", () => {
    allure.step("Child step for External step", () => {
      expect(false).to.equal(true);
    });
  });

describe("Allure step", () => {
  it("divides test code by blocks", () => {
    allure.step("First step", () => {
      expect(true).to.equal(true);
    });
    allure.step("Second step", () => {
      expect(false).to.equal(true);
    });
  });

  it("allows nested steps", () => {
    allure.step("Parent step", () => {
      allure.step("Child step", () => {
        expect(true).to.equal(true);
      });
    });
  });

  it("helpful for highlighting common test code usage", () => {
    commonStep();
  });
});
