package homework_1.radik_manasyan;

public class Average {
    public static void main(String[] args) {
        double average[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int i = 0; i < 5; i++) {
            result += average[i];
        }
        double total_result = result / 5;
        System.out.println("Среднее значение = " + total_result);
    }
}
