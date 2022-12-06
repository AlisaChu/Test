import junit.framework.TestCase;
import org.example.less18.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void matrixTest(){
        int[][] matrix = {{60, 100}, {100, 60}};
        Matrix matrix1 = new Matrix();
        boolean isSquare = matrix1.matrixSquare(matrix);
        Assert.assertEquals(true,isSquare);
    }
    @Test
    public void matrixOneNull() {
        int[][] matrix = {{60, 100}};
        Matrix matrix1 = new Matrix();
        boolean isSquare = matrix1.matrixSquare(matrix);
        Assert.assertEquals(false,isSquare);
    }
    @Test
    public void matrixNull() {
        int[][] matrix = {{}};
        Matrix matrix1 = new Matrix();
        boolean isSquare = matrix1.matrixSquare(matrix);
        Assert.assertEquals(false,isSquare);
    }
    @Test
    public void matrixSquare(){
        Matrix matrix1 = new Matrix();
        int[][] matrix = {{60}, {100, 60}};
        boolean isSquare = matrix1.matrixSquare(matrix);
        Assert.assertEquals(isSquare,false);
    }
}

