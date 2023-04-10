package homework_9.garik_gharibyan.assignment.annotations.name_annotatuion;

import homework_9.garik_gharibyan.assignment.error.Error;

import java.lang.reflect.Field;

public class NameAnnotationProcessor {
    public static Error processAnnotation(Object obj) throws IllegalAccessException {

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Length.class)) {

                Object o = field.get(obj);
                if (o instanceof String){
                    String name = (String) o;

                    int min = field.getAnnotation(Length.class).min();
                    int max = field.getAnnotation(Length.class).max();

                    if (name.length() > max) {
                        return new Error(name + " - length of name is long " + max, field.getName());
                    } else if (name.length() < min) {
                        return new Error(name + " - length of name is short " + min, field.getName());
                    }
                }else {
                    return new Error("Wrong annotation",field.getName());

                }

            }
        }
        return null;
    }
}
