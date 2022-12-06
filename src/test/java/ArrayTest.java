import junit.framework.TestCase;
import org.example.less18.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    @Test
    public void arrayAverage() {
        int[] arr = {5, 20, 87, 100, 13};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int expected = 45;
        Assert.assertEquals(expected, sum/arr.length);
    }

    @Test
    public void arrayMeanNull() {
        int[] arr = new int[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int expected = 0;
        Assert.assertEquals(expected, sum);
    }
}

