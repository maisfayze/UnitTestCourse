import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example3{
    // if don't add priority parameter, it put the default value that equals=0
    // then execute all test that don't have priority, by alphabetic

    @BeforeClass
    public void statuesbeforeClass(){
        System.out.println("CLASS is Started");
    }
     @BeforeMethod
    public void statuesbefore(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+"Started");
    }
    @AfterMethod
    public void statuesAfter(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+"finished");

    }

    @Test(priority = 1)

    public void testDivision1(){
        System.out.println("testDivision1");
        Assert.assertTrue(5==5);
    }
    @Test(priority = 2)
    public void testDivision2(){
        System.out.println("testDivision2");

        Assert.assertTrue(5==5);
    }
    @Test(priority = 0)
    public void testDivision3(){
        System.out.println("testDivision3");

        Assert.assertTrue(5==5);
    }
    @Test(priority =3)
    public void testDivision4(){
        System.out.println("testDivision5");

        Assert.assertTrue(5==5);
    }
    @Test
    public void testDivision5(){
        System.out.println("testDivision6");

        Assert.assertTrue(5==5);
    }

}