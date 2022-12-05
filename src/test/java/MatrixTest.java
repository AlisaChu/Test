import junit.framework.TestCase;
import org.example.less18.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void matrixTest(){
        Matrix matrix = new Matrix();
        int[][] arr = {{60, 100}, {100, 60}};
        boolean expected = true;
        boolean output = matrix.matrixSquare(arr);
        Assert.assertEquals(expected, output);
    }
    @Test
    public void matrixSquare() {
        Matrix matrix = new Matrix();
        int[][] arr = {{60}, {60, 100}};
        boolean expected = false;
        boolean output = matrix.matrixSquare(arr);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void matrixOneNull() {
        Matrix matrix = new Matrix();
        int[][] arr = {{60, 100}};
        boolean expected = false;
        boolean output = matrix.matrixSquare(arr);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void matrixNull() {
        Matrix matrix = new Matrix();
        int[][] arr = {{}};
        boolean expected = false;
        boolean output = matrix.matrixSquare(arr);
        Assert.assertEquals(expected, output);
    }
}


