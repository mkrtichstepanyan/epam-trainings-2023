package homework_1.Armen_Martirosyan;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int[][] twoD1 = new int[4][];
        twoD1[0] = new int[1];
        twoD1[1] = new int[2];
        twoD1[2] = new int[3];
        twoD1[3] = new int[4];

        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        i = 0;
        j = 0;
        k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                twoD1[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoD1[i][j] + " ");
            }
            System.out.println();
        }
    }
}