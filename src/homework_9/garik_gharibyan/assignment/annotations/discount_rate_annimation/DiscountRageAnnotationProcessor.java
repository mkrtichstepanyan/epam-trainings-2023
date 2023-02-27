package homework_9.garik_gharibyan.assignment.annotations.discount_rate_annimation;

import homework_9.garik_gharibyan.assignment.error.Error;

import java.lang.reflect.Field;


public class DiscountRageAnnotationProcessor {
    public static Error processAnnotation(Object obj) throws IllegalAccessException {

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(Max.class) && field.isAnnotationPresent(Min.class)) {

                Object o = field.get(obj);
                if (o instanceof  Integer){
                    int rate = (int) o;
                    int min = field.getAnnotation(Min.class).min();
                    int max = field.getAnnotation(Max.class).max();
                    if (rate < min || rate > max) {
                        return new  Error("Discount rate can be in rate [" + min + "-" + max + "]", field.getName());
                    }
                }else {
                    return new Error("Wrong annotation",field.getName());
                }
            }
        }
        return null;
    }
}
