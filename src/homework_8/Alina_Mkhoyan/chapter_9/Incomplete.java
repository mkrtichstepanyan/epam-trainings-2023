package homework_8.Alina_Mkhoyan.chapter_9;

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}