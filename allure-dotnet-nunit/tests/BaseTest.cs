using Allure.Commons;
using NUnit.Allure.Attributes;
using NUnit.Allure.Core;

namespace allure_nunit.tests
{
    [AllureNUnit]
    [AllureParentSuite("Root Suite")]
    public class BaseTest
    {
        // [OneTimeSetUp]
        public void CleanupResultDirectory()
        {
            AllureExtensions.WrapSetUpTearDownParams(() => { AllureLifecycle.Instance.CleanupResultDirectory(); },
                "Clear Allure Results Directory");
        }
    }
}