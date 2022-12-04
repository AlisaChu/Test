import org.example.less17.MatrixCal;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void MatrixCal(){
        MatrixCal matrix = new MatrixCal();
        int[][] arr = {{60, 100}, {100, 60}};
        boolean expected = true;
        boolean output = matrix.MatrixCal(arr);
        Assert.assertEquals(expected, output);
    }
}
