package Aram_Mehrabyan;

public class Array {
    public static void main(String[] args) {
        /*
        int []month_days;
        month_days=new int[12];
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=31;
        month_days[3]=30;
        month_days[4]=31;
        month_days[5]=30;
        month_days[6]=31;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]=30;
        month_days[11]=31;
        System.out.println("The June has a "+month_days[5]+" days.");
         */
        // String []week_days={"Son","Mon","Tue","Wed","Thu","Fri","Sat"};
        // System.out.println("The weekend days is:"+week_days[6]+" and "+week_days[0]);
        /*
        double []numbers={10.2,50.0,83.56,45.0};
        double sum=0;
        for (int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println("The result is: "+sum);
        */
        /*
        int i,j,k=0;
        int [][]numbers=new int[4][5];
        for(i=0;i<4;i++)
            for(j=0;j<5;j++){
                numbers[i][j]=k;
                k++;
            }
        for(i=0;i<4;i++) {
            for (j = 0; j < 5; j++)
                System.out.print(numbers[i][j] + " ");
            System.out.println();
        }
        */
  /*
        int i,j;
        int [][]num=new int[4][5];
        for(i=0;i<4;i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
   */
        int i, j, k;
        int[][][] threeD = new int[3][4][5];
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    threeD[i][j][k] = i + j + k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++){
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k]+" ");
                System.out.println();
            }
            System.out.println();
        }

    }
}


