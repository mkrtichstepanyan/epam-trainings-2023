package homework_1.Diana_Melkonyan;

public class Matrix {
    public static void main(String[] args) {
        double[][] m = new double[][]{{0.0, 0.0, 0.0, 0.0}, {0.0, 1.0, 2.0, 3.0}, {0.0, 2.0, 4.0, 6.0}, {0.0, 3.0, 6.0, 9.0}};

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }
}
