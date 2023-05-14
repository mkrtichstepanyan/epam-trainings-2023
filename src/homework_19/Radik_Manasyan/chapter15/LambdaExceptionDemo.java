package homework_19.Radik_Manasyan.chapter15;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4};

        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0) {
                throw new EmptyArrayException();
            }

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };

        System.out.println("The average is " + average.func(values));
        System.out.println("The average is " + average.func(new double[0]));
    }
}
