package TestNGDemo.Demo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classTwoTest1(String url,String username,String password)
    {
        /*String url = "http://facebook.com";
        String username = "admin";
        String password = "admin123";*/
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("classTwoTest1");
    }
    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }
    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
