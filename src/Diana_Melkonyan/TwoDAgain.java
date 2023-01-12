package Diana_Melkonyan;

public class TwoDAgain {
    public static void main(String[] args) {
        int[][] twoD = new int[][]{new int[1], new int[2], new int[3], new int[4]};
        int k = 0;

        int i;
        int j;
        for(i = 0; i < 4; ++i) {
            for(j = 0; j < i + 1; ++j) {
                twoD[i][j] = k++;
            }
        }

        for(i = 0; i < 4; ++i) {
            for(j = 0; j < i + 1; ++j) {
                System.out.println(twoD[i][j] + " ");
            }
        }

        System.out.println();
    }
}
