var CucumberJSAllureFormatter = require("allure-cucumberjs").CucumberJSAllureFormatter;
var AllureRuntime = require("allure-cucumberjs").AllureRuntime;

function Reporter(options) {
    CucumberJSAllureFormatter.call(this,
        options,
        new AllureRuntime({ resultsDir: "./allure-results" }),
        {});
}
Reporter.prototype = Object.create(CucumberJSAllureFormatter.prototype);
Reporter.prototype.constructor = Reporter;

exports.default = Reporter;
