package homework_11.garik_gharibyan.chapter_22.serialization;

import java.io.Serializable;

public class MyClass implements Serializable {
    String s;
    int i;
    transient double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
