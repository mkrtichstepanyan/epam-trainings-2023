package homework_1.Liana_Gevorgyan;
//Demonstrate two decimal array
public class TwoDArray {
    public static void main(String args[]) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
                //System.out.println(twoD[i][j] + " ");
            }
        }
        for (i = 0; i < 4; i++) {
           for (j = 0; j < 5; j++) {
               System.out.print(twoD[i][j] + " ");
           }
           System.out.println();
        }
    }

}

