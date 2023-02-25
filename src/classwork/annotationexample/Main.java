package classwork.annotationexample;
import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer(999);

        for (Field field : customer.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MinValue.class)) {
                field.setAccessible(true);
                int i = (int)field.get(customer);
                MinValue annotation = field.getAnnotation(MinValue.class);
                int value = annotation.value();
                if (i < value) {
                    System.out.println("The field " + field.getName() + " must not be less then " + value);
                }

            }
        }

    }
}
