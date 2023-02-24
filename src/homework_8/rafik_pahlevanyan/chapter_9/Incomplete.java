package homework_8.rafik_pahlevanyan.chapter_9;

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}