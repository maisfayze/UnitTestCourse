import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleTest {

    Calculator c = new Calculator();
    @DataProvider(name ="Valid Division Data")
    public Object[][] dpMethod(){
        return new Object[][]{
                { 10.0f, 5.0f,2.0f},
                { -10f, 5.0f,-2.0f},   { 10f, -5.0f,-2.0f},
                { -10f, -5.0f,2.0f},
                { 0, -5.0f,0},
                { 0, 5.0f,0},
        };
    }

    @DataProvider(name ="InValid Division Data")
    public Object[][] dpInvalidMethod(){
        return new Object[][]{
                { 10, 0},
                { 10.f, 0.f},


        };
    }
    @Test(dataProvider = "Valid Division Data")
    public void testValidDiviation(float x , float y, float expected){

        float z =c.division(x,y);
        Assert.assertEquals(z,expected);

    }


    @Test(dataProvider = "InValid Division Data" ,expectedExceptions = ArithmeticException.class)
    public void testInavalidDiviation(float x , float y){

     c.division(x,y);

    }


}
