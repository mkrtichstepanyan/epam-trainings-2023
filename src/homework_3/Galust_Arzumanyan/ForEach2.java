package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate break with a for-each style for
class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] num = {1, 3, 5, 7, 9,};

        //use for to display and sum the values
        for (int x : num) {
            System.out.println(" Value is " + x);
            sum += x;
            if (x == 5) break; // stop the loop when 5 is obtained
        }
        System.out.println(" Summation of first 5 elements: " + sum);
    }
}
