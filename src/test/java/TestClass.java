import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by msingh on 1/10/2017.
 */
public class TestClass
{
    @Test
    public void Test1(){
        Assert.assertTrue(1==1, "This will pass");
    }

    @Test
    public void Test2(){
        Assert.assertTrue(1==2, "This will fail");
    }
}
