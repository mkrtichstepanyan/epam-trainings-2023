package Diana_Melkonyan;

public class TwoArray {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int k = 0;

        int i;
        int j;
        for(i = 0; i < 4; ++i) {
            for(j = 0; j < 5; ++j) {
                twoD[i][j] = k++;
            }
        }

        for(i = 0; i < 4; ++i) {
            for(j = 0; j < 5; ++j) {
                System.out.print(twoD[i][j] + " ");
            }

            System.out.println();
        }
    }
}
