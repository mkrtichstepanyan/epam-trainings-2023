package homework_8.Hovhannes_Abrahamyan.chapter_9;

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}