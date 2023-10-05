package TestNGDemo.Demo2;

import org.testng.annotations.*;

public class ClassThree {
    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }
    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }

    @BeforeSuite
    public void beforeMySuite()
    {

        System.out.println("beforeMySuite1");
    }
    @AfterSuite
    public void afterMySuite()
    {

        System.out.println("afterMySuite1");
    }
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classThreeTest1(String url,String username,String password)
    {
        /*String url = "http://facebook.com";
        String username = "admin";
        String password = "admin123";*/
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("classThreeTest1");
    }
    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
