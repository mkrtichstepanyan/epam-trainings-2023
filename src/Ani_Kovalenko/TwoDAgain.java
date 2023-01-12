package Ani_Kovalenko;

public class TwoDAgain {
    public static void main(String[] args) {
        int[][] TwoD = new int[4][];
        TwoD[0] = new int[1];
        TwoD[1] = new int[2];
        TwoD[2] = new int[3];
        TwoD[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
        for (j = 0; j<i+1; j++) {
            TwoD[i][j] = k;
            k++;}
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(TwoD[i][j] + " ");
                System.out.println();
        }

    }
}
