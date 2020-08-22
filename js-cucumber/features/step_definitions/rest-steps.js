const { When, Then } = require("cucumber");

When("I create label with title {string} via api", (string) => {});

Then("I should see label with title {string} via api", (string) => {});

When("I delete label with title {string} via api", (string) => {});

Then("I should not see label with content {string} via api", (string) => {});
