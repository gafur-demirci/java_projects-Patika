public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];
        int num = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = num++;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/*
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i <  3; i++) {
            for (int j = 0; j < i + 1; j++){
                arr[i][j] = j + 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}
 */



