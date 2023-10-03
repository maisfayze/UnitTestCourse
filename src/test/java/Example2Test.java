import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example2Test {

    Calculator c = new Calculator();

    @DataProvider(name = "MarkData")
    public Object[][] dpMethod() {
        return new Object[][]{
                {101, "Invalid"},
                {95, "Invalid"},
                {100000000, "Invalid"},
                {90, "Excellent"},
                {91, "Excellent"},
                {99, "Excellent"},
                {100, "Excellent"},
                {80, "Very Good"},
                {81, "Very Good"},
                {88, "Very Good"},
                {89, "Very Good"},
                {70, "Good"},
                {71, "Good"},
                {78, "Good"},
                {78, "Good"},
                {60, "Accepted"},
                {61, "Accepted"},
                {68, "Accepted"},
                {69, "Accepted"},
                {40, "Failed"},
                {41, "Failed"},
                {58, "Failed"},
                {57, "Failed"},
                {59, "Failed"},
                {39, "Invalid"},
                {0, "Invalid"},
                {-10000000, "Invalid"},
                {-1, "Invalid"},
                {-520, "Invalid"},
                {-1000, "Invalid"},




        };
    }

    @Test(dataProvider = "MarkData")
    public void testMark(int mark, String grade) {

        String z = c.getGrade(mark);
        Assert.assertEquals(z, grade);

    }

    @Test(dataProvider = "MarkData",enabled =false)
    public void testMark2(int mark, String grade) {

        String z = c.getGrade(mark);
        Assert.assertEquals(z, grade);

    }
}
