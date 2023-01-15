package homework_1.Alina_Vardanovna;

public class Average {

    public static void main(String[] args) {

        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        System.out.println("Տրված շարքի միջին թվաբանականը " + result / 5 + " է");

    }

}
