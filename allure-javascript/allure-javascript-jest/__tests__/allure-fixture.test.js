// beforeAll(() => {
//   allure.step("Step inside before all", () => {});
// });
//
// afterAll(() => {
//   allure.step("Step inside after all", () => {});
// });

beforeEach(() => {
  allure.step("Step inside before each", () => {});
});

afterEach(() => {
  allure.step("Step inside after each", () => {});
});

describe("test", () => {
  beforeAll(() => {
    allure.step("Step inside describe before all", () => {});
  });
  afterAll(() => {
    allure.step("Step inside describe after all", () => {});
  });
  beforeEach(() => {
    allure.step("Step inside describe before each", () => {});
  });
  afterEach(() => {
    allure.step("Step inside describe after each", () => {});
  });
  test("Allure fixture test 1", () => {
    allure.step("Simple step", () => {});
  });
  test("Allure fixture test 2", () => {
    allure.step("Simple step", () => {});
  });
});
