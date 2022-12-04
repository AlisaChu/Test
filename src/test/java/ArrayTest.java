import junit.framework.TestCase;
import org.example.less17.ArrayCal;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    @Test
    public void ArrayCal(){
            ArrayCal arrayCal = new ArrayCal();
            int[] arr = {5, 20, 87, 100, 13};
            int expected = 45;
            int output = arrayCal.ArrayCal(arr);
            Assert.assertEquals(expected, output, 1);
    }
}
