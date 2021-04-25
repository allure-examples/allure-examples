using System;
using Allure.Commons;
using NUnit.Allure.Attributes;
using NUnit.Allure.Core;
using NUnit.Framework;

namespace allure_nunit.tests
{
    [AllureSuite("Tests - Steps")]
    public class AllureStepTest : BaseTest
    {
        [AllureStep]
        private void Step1()
        {
            Console.WriteLine("1");
        }

        [AllureStep("Step 3 - with explicit name")]
        private void Step3()
        {
            Console.WriteLine("3");
        }

        [Test]
        public void SimpleStepTest()
        {
            Step1();

            AllureLifecycle.Instance.WrapInStep(() => { Console.WriteLine("Step 2"); }, "Step2");

            Step3();
        }

        [Test]
        public void WrappedStepTest()
        {
            AllureLifecycle.Instance.WrapInStep(() =>
            {
                Step1();

                AllureLifecycle.Instance.WrapInStep(() =>
                {
                    Console.WriteLine("2");
                    AllureLifecycle.Instance.WrapInStep(() => { Console.WriteLine("Step in step 2"); },
                        "Step in Step 2");
                }, "Step2");

                Step3();
            }, "RootStep");
        }
    }
}