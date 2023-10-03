import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleTest {

    Calculator c = new Calculator();
    @DataProvider(name ="DivisionData")
    public Object[][] dpMethod(){
        return new Object[][]{
                { 10.0f, 5.0f,2.0f},
                { -10f, 5.0f,-2.0f},   { 10f, -5.0f,-2.0f},
                { -10f, -5.0f,2.0f},
                { 0, -5.0f,0},
                { 0, 5.0f,0},


        };
    }
    @Test(dataProvider = "DivisionData")
    public void testDiviation(float x , float y, float expected){

        float z =c.division(x,y);
        Assert.assertEquals(z,expected);

    }


}
