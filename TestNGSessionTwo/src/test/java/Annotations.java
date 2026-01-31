import org.testng.annotations.*;

    public class Annotations {

        @BeforeSuite
        public void beforeSuite() {
            System.out.println("Before Suite executed");
        }

        @BeforeTest
        public void beforeTest() {
            System.out.println("Before Test executed");
        }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Before Class executed");
        }

        @BeforeMethod
        public void beforeMethod() {
            System.out.println("Before Method executed");
        }

        @Test
        public void testCase1() {
            System.out.println("Test Case 1 executed");
        }

        @Test
        public void testCase2() {
            System.out.println("Test Case 2 executed");
        }

        @Test(groups = "regression")
        public void testCase3() {
            System.out.println("Test Case 3 executed");
        }

        @AfterMethod
        public void afterMethod() {
            System.out.println("After Method executed");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("After Class executed");
        }

        @AfterTest
        public void afterTest() {
            System.out.println("After Test executed");
        }

        @AfterSuite
        public void afterSuite() {
            System.out.println("After Suite executed");
        }
    }