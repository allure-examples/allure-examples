const JasmineAllureReporter = require("allure-jasmine").JasmineAllureReporter;
const AllureRuntime = require("allure-jasmine").AllureRuntime;

const allure = new AllureRuntime({ resultsDir: "allure-results" });
const reporter = new JasmineAllureReporter(allure);

jasmine.getEnv().addReporter(reporter);

global.allure = reporter.getInterface();
