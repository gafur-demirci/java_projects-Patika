public class ArrayTranspose {
    public static void main(String[] args) {

        int[][] multiDimArr = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };

        for (int i=0; i<multiDimArr.length; i++){
            for(int j=0; j< multiDimArr[0].length; j++){
                System.out.print(multiDimArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("**************************");

        for(int k =0; k<multiDimArr[0].length; k++){
            for(int l=0; l< multiDimArr.length; l++){
                System.out.print(multiDimArr[l][k] + "\t");
            }
            System.out.println();
        }
    }
}
