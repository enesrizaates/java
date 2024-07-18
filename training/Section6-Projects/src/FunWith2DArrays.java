import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        // 2 row x 3 column
        int[][] my2DArray = new int[2][3]; // 2 rows x 3 columns

        fill2DArray(my2DArray);
        print2DArray(my2DArray);

        System.out.println();

        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2DArray(int[][] twoDArr) {
        Random rand = new Random();
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                // row i, column j
                twoDArr[i][j] = rand.nextInt(100);  // 0..99 (inclusive)
            }
        }
    }

    public static void print2DArray(int[][] twoDArr) {
        for (int[] arr: twoDArr) {
            for (int num: arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j =0; j < twoDArray[0].length; j++) {
                twoDArray[i][j] *= 2;
            }
        }
    }
}
