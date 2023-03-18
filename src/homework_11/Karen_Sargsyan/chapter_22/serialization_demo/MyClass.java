package homework_11.Karen_Sargsyan.chapter_22.serialization_demo;

import java.io.Serializable;

public class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s = " + s + "; i = " + i + "; d = " + d;
    }

}
