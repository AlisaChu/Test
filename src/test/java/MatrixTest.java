import junit.framework.TestCase;
import org.example.less18.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void matrixTest(){
        int[][] matrix = {{60, 100,12}, {100, 60,123}, {12,100, 60}};

        int lenght = matrix.length;
        boolean isSquare = true;
        for(int i = 0;i < matrix.length;i++) {
            if (lenght != matrix[i].length) {
                isSquare = false;
                break;
            }
        }
        Assert.assertEquals(true,isSquare);
    }

    @Test
    public void matrixSquare() {
        int[][] matrix = {{60, 100,12}, {100, 60}, {12,100, 60}};

        int lenght = matrix.length;
        boolean isSquare = true;
        for(int i = 0;i < matrix.length;i++) {
            if (lenght != matrix[i].length) {
                isSquare = false;
                break;
            }
        }
        Assert.assertEquals(false,isSquare);
    }

    @Test
    public void matrixOneNull() {
        int[][] matrix = {{60, 100,12}};

        int lenght = matrix.length;
        boolean isSquare = true;
        for(int i = 0;i < matrix.length;i++) {
            if (lenght != matrix[i].length) {
                isSquare = false;
                break;
            }
        }
        Assert.assertEquals(false,isSquare);
    }

    @Test
    public void matrixNull() {
        int[][] matrix = {};

        int lenght = matrix.length;
        boolean isSquare = true;
        for(int i = 0;i < matrix.length;i++) {
            if (lenght != matrix[i].length) {
                isSquare = false;
                break;
            }
        }
        Assert.assertEquals(true,isSquare);
    }
}

