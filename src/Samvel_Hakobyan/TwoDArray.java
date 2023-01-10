package Samvel_Hakobyan;

public class TwoDArray {
    public static void main(String[] args) {

        int [][] arr = new int[4][5];
        int i,j,
        k = 0;
        for (i = 0; i < 4; i++)
            for ( j = 0; j < 5; j++) {
                arr[i][j]=k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();

        }
    }
}
