const { When, Then, After } = require("cucumber");

When("I open labels page", () => {});

When("I create label with title {string}", string => {});

Then("I should see label with title {string}", string => {});

When("I open issue with id {int}", int => {});

When("I add label with title {string} to issue", string => {});

When("I filter issue by label title {string}", string => {});

Then("I should see issue with label title {string}", string => {});

When("I delete label with title {string}", string => {});

Then("I should not see note with content {string}", string => {});

When("I open milestones page", () => {});

When("I create milestone with title {string}", string => {});

Then("I should see milestone with title {string}", string => {});

When("I delete milestone with title {string}", string => {});

Then("I should not see milestone with content {string}", string => {});
