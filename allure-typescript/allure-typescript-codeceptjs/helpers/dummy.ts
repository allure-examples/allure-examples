import * as assert from "assert";
import * as CodeceptJS from "codeceptjs"


class Dummy extends CodeceptJS.Helper {
  public async passedStep() {}
  public async failedStep() {
    assert(false);
  }
}

export = Dummy;
