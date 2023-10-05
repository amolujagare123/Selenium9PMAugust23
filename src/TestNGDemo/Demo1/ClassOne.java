package TestNGDemo.Demo1;

import org.testng.annotations.*;

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



    @Test //(enabled = false)
    public void classOneTest1()
    {

        System.out.println("classOneTest1");

    }
    @Test (groups = "email")
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
