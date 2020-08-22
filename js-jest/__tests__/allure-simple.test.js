const allure = require("../report.js").allure;


describe("test", () => {
    it("simple", () => {
        allure.step("aaa", () => {})

    });

});
