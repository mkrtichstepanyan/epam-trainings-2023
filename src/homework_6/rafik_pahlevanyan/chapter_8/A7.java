package homework_6.rafik_pahlevanyan.chapter_8;

//A simple demonstration of abstract.
abstract class A7 {
    abstract void callme();

    //concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is concrete method. ");
    }
}