package homework_9.Ani_Kovalenko.Chapter_12.Example_7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface TypeAnno {
}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

@Target(ElementType.TYPE_USE)
@interface Unique {
}

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK {
}

@Target(ElementType.METHOD)
@interface Recommended {
}
