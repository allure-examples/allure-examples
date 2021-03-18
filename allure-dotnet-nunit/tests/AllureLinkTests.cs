using NUnit.Allure.Attributes;
using NUnit.Framework;

namespace allure_nunit.tests
{
    [AllureSuite("Tests - Links")]
    public class AllureLinkTest : BaseTest
    {
        [Test]
        [AllureLink("Github", "https://github.com")]
        [AllureLink("https://google.com")]
        [AllureIssue("ISSUE-123")]
        [AllureTms("TMS-123")]

        public void LinkTest()
        {
        }
    }
}