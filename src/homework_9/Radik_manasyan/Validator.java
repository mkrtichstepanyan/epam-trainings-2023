package homework_9.Radik_manasyan;


import homework_9.Radik_manasyan.annotations.*;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class Validator {
    @Length(min = 2, max = 30)
    String name;

    Validator(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    static void isValidate(Object object) throws IllegalAccessException {
        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(Length.class)) {
                String objGetName = (String) field.get(object);
                Length annotation = field.getAnnotation(Length.class);
                int min = annotation.min();
                int max = annotation.max();
                if (objGetName.length() < min || objGetName.length() > max) {
                    System.out.println("Please input correct name! Name has > " + min + " and < " + max);

                }
            } else if (field.isAnnotationPresent(Email.class)) {
                String objGetEmail = (String) field.get(object);
                Email anno = field.getAnnotation(Email.class);
                String value = anno.value();
                Pattern compile = Pattern.compile(value);
                Matcher matcher = compile.matcher(objGetEmail);

                if (!matcher.matches()) {
                    System.out.println("Pleae input @");
                }

            } else if (field.isAnnotationPresent(Adulthood.class)) {
                LocalDate now = LocalDate.now();
                LocalDate birthday = (LocalDate) field.get(object);
                Adulthood annotation = field.getAnnotation(Adulthood.class);
                int age = annotation.age();
                if (now.getYear() - birthday.getYear() < age) {
                    System.out.println("Yor age < " + age);
                }
            } else if (field.isAnnotationPresent(Min.class)) {
                int minDiscountRate = (int) field.get(object);
                Min annotation = field.getAnnotation(Min.class);
                int min = annotation.value();
                if (min == minDiscountRate) {
                    System.out.println("Limit must be greater than 0");
                } else if (field.isAnnotationPresent(Max.class)) {
                    int maxDiscountRate = (int) field.get(object);
                    Max mAnnotation = field.getAnnotation(Max.class);
                    int max = mAnnotation.value();
                    if (max < maxDiscountRate) {
                        System.out.println("Limit must be less than 100");
                    }
                }
            }
        }
    }
}


