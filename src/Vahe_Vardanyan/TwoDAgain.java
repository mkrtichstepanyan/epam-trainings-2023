package Vahe_Vardanyan;

public class TwoDAgain {
    public static void main(String[] args) {

        int[][] arr1 = new int[4][];
        arr1[0] = new int[1];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        arr1[3] = new int[4];

        int i5, j1,
                k1 = 0;
        for (i5 = 0; i5 < 4; i5++)
            for (j1 = 0; j1 < i5 + 1; j1++) {
                arr1[i5][j1] = k1;
                k1++;
            }
        for (i5 = 0; i5 < 4; i5++) {
            for (j1 = 0; j1 < i5 + 1; j1++)
                System.out.print(arr1[i5][j1] + " ");
            System.out.println();

        }
    }
}
