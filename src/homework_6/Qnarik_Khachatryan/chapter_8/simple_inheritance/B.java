package homework_6.Qnarik_Khachatryan.chapter_8.simple_inheritance;

//create a subclass by extending class A
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}
