const { When, Then } = require("cucumber");

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I create label with title {string} via api", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
Then("I should see label with title {string} via api", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I delete label with title {string} via api", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
Then("I should not see label with content {string} via api", string => {});
