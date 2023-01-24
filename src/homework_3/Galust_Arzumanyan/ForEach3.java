package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate for-each style for on a two-dimensional array
class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] num = new int[2][4];

        //give num some values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (i + 1) * (j + 1);

                //use for-each for to display and sum the values
                for (int[] x : num) {
                    for (int y : x) {
                        System.out.println(" Value is " + y);
                        sum += y;
                    }
                }
                System.out.println(" Summation: " + sum);
            }
        }
    }
}
