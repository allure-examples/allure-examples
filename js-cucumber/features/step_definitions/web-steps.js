const { When, Then } = require("cucumber");

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I open labels page", () => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I create label with title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
Then("I should see label with title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I open issue with id {int}", int => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I add label with title {string} to issue", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I filter issue by label title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
Then("I should see issue with label title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I delete label with title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
Then("I should not see note with content {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I open milestones page", () => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I create milestone with title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
Then("I should see milestone with title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
When("I delete milestone with title {string}", string => {});

/*eslint new-cap: ["error", { "capIsNew": false }]*/
Then("I should not see milestone with content {string}", string => {});
