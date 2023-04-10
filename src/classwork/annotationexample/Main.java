package classwork.annotationexample;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws  IllegalAccessException, @CustomerTypeAnnotation NullPointerException {
        Customer customer = getCustomer();

        for (Field field : customer.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Constraints.class)) {
                field.setAccessible(true);
                int i = (int) field.get(customer);
                Constraints annotation = field.getAnnotation(Constraints.class);
                for (Constraint constraint:annotation.value()) {
                    System.out.println(constraint.value());
                }

            }
        }

    }

    static Customer getCustomer() {
        Customer customer = new Customer(999);
        return customer;
    }
}
