package Vahe_Vardanyan;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        int i3, j,
        k = 0;
        for (i3 = 0; i3 < 4; i3++)
        for (j = 0; j < 5; j++) {
        arr[i3][j] = k;
        k++;
        }

        for (i3 = 0; i3 < 4; i3++) {
        for (j = 0; j < 5; j++)
        System.out.print( arr  [i3] [j] + " ");


        }

    }
}
