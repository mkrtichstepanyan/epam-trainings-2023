package homework_9.Karen_Sargsyan.Chapter_12.type_anno_demo;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.TYPE_USE)
@interface TypeAnno { }

@Target(ElementType.TYPE_USE)
@interface NotZeroLen { }

@Target(ElementType.TYPE_USE)
@interface Unique { }

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK { }

@Target(ElementType.METHOD)
@interface Recommended { }

public class TypeAnnoDemo <@What(description = "Generic data type") T> {

    public @Unique TypeAnnoDemo() { }

    @TypeAnno String str;

    @EmptyOK String test;

    public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    public @Recommended Integer f3(String str) {
        return str.length();
    }

    public void f4() throws @TypeAnno NullPointerException{

    }

    String @MaxLen(10) [] @NotZeroLen [] w;

    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        TypeAnnoDemo<@TypeAnno Integer> ob =
                new TypeAnnoDemo<@TypeAnno Integer>();
        @Unique TypeAnnoDemo<Integer> ob2 =
                new @Unique TypeAnnoDemo<Integer>();

        Object x = Integer.valueOf(10);
        Integer y;

        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> { }

}
