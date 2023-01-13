package homework_1.Samvel_Hakobyan;

public class TwoDAgain {
    public static void main(String[] args) {
        int [][] arr1 = new int[4][];
        arr1[0] = new int[1];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        arr1[3] = new int[4];

        int i, j,
                k = 0;
        for (i = 0; i <4 ; i++)
            for (j = 0; j <i+1 ; j++) {
                arr1[i][j] = k;
                k++;
            }
        for (i = 0; i < 4 ; i++) {
            for (j = 0; j<i + 1 ; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println();

        }
    }
}
