package classwork.annotationhomework;

import classwork.annotationhomework.error.Error;
import classwork.annotationhomework.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
