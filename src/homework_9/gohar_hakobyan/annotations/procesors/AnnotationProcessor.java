package homework_9.gohar_hakobyan.annotations.procesors;


import homework_9.gohar_hakobyan.error.Error;

import java.lang.reflect.Field;

public abstract class AnnotationProcessor {

      protected  abstract Error processAnnotation(Object customer, Field field) throws IllegalAccessException;

}
