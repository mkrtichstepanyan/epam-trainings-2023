package homework_8.Yeghia_Ansuryan.Chapter_9.Callback.NestedIfDemo;

import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.Callback;

public abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
