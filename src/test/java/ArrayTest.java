import junit.framework.TestCase;
import org.example.less18.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    @Test
    public void arrayAverage() {
        Array array = new Array();
        int[] arr = {5, 20, 87, 100, 13};
        int expected = 45;
        int output = array.arrayAverage(arr);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void arrayMeanNull() {
        Array array = new Array();
        int[] arr = {};
        int expected = 0;
        int output = array.arrayAverage(arr);
        Assert.assertEquals(expected, output);
    }
}


