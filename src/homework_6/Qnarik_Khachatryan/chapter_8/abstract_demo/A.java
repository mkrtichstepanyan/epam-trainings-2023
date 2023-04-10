package homework_6.Qnarik_Khachatryan.chapter_8.abstract_demo;

abstract class A {
    abstract void callme();

    //concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}
