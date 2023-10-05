package TestNGDemo.Demo2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite");
    }
    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite");
    }



    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classOneTest1(String url,String username,String password)
    {
        /*String url = "http://facebook.com";
        String username = "admin";
        String password = "admin123";*/
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);

        System.out.println("classOneTest1");
    }
    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }
    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
