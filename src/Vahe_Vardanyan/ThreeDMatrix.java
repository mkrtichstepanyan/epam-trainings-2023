package Vahe_Vardanyan;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        int i8, j9, k2;

        for (i8 = 0; i8 < 3; i8++)
            for (j9 = 0; j9 < 4; j9++)
                for (k2 = 0; k2 < 5; k2++)
                    threeD[i8][j9][k2] = i8 * j9 * k2;
        for (i8 = 0; i8 < 3; i8++) {
            for (j9 = 0; j9 < 4; j9++) {
                for (k2 = 0; k2 < 5; k2++)
                    System.out.println(threeD[i8][j9][k2] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}



