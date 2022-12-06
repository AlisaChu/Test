import junit.framework.TestCase;
import org.example.less18.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void arrayAverage() {
        int[] arr = {5, 20, 87, 100, 13};
        Array array = new Array();
        int sum = array.arrayAverage(arr);
        int expected = 45;
        Assert.assertEquals(expected, sum);
    }

    @Test
    public void arrayMeanNull() {
        int[] arr = new int[0];
        Array array = new Array();
        int sum = array.arrayAverage(arr);
        int expected = 0;
        Assert.assertEquals(expected, sum);
    }
}


