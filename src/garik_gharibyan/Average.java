package garik_gharibyan;

public class Average {
    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double res = 0;
        int i;

        for (i = 0; i < 5; i++){
            res = res + numbers[i];
        }
        System.out.println("Average is - " + res/numbers.length);
    }
}
