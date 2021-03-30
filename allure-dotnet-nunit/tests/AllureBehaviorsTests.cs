using NUnit.Allure.Attributes;
using NUnit.Framework;

namespace allure_nunit.tests
{
    [AllureSuite("Tests - Behaviors")]
    [AllureEpic("Epic")]
    public class AllureBehaviorsTest : BaseTest
    {
        [Test]
        [AllureFeature("f1")]
        public void F1()
        {
            Assert.IsTrue(true);
        }

        [Test]
        [AllureFeature("f2")]
        [AllureStory("A")]
        public void F2()
        {
            Assert.IsTrue(true);
        }
    }
}