package homework_9.Roza_Petrosyan.annotation_task.annotations.processors;

import homework_9.Roza_Petrosyan.annotation_task.error.Error;

import java.lang.reflect.Field;

public interface ProcessAnnotation {
    Error processAnnotation(Object obj, Field field) throws IllegalAccessException;
}
