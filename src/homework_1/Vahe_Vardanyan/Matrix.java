package homework_1.Vahe_Vardanyan;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("16/");
        double[][] m = {
                {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                {0 * 2, 1 * 2, 2 * 2, 3 * 2},
                {0 * 3, 1 * 3, 2 * 3, 3 * 3}


        };
        int i7, j8;
        for (i7 = 0; i7 < 4; i7++) {
            for (j8 = 0; j8 < 4; j8++)
                System.out.println(m[i7][j8] + " ");
            System.out.println();


        }

    }
}
