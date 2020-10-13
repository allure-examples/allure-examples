/*eslint camelcase: ["error", {allow: ["codecept_helper"]}]*/
const Helper = codecept_helper;
const assert = require("assert");

class Dummy extends Helper {
  async passedStep() {}
  async failedStep() {
    await assert(false);
  }
}

module.exports = Dummy;
