package homework_10.anna_manukyan.pizzeria.validators;


import homework_10.anna_manukyan.pizzeria.Order;
import homework_10.anna_manukyan.pizzeria.annotations.NotNull;
import homework_10.anna_manukyan.pizzeria.product.Product;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    static List<String> errors = new ArrayList<>();

    public static List<String> validate(Order order) throws IllegalAccessException {
        Product[] products = order.getFoods();
        for (Product product : products) {
            if (product != null) {
                for (Field field : product.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    valid(field, product);
                }
            }
        }
        return errors;

    }

    private static void valid(Field field, Product dto) throws IllegalAccessException {
        if (field.getAnnotation(NotNull.class) != null) {
            Object obj = field.get(dto);
            NotNull annotation = field.getAnnotation(NotNull.class);
            String message = annotation.message();
            if (obj == null) {
                errors.add("Some fields " +
                        " are null. Please input again correct values.");
            }
        }

    }

}
