exports.config = {
    tests: "./specs/*.spec.js",
    helpers: {
        Dummy: {
            require: "./helpers/dummy.js"
        }
    },
    plugins: {
        allure: {
            outputDir: "./allure-results"
        }
    }
};
