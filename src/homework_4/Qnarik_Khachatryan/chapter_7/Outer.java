package homework_4.Qnarik_Khachatryan.chapter_7;

//Demonstrate an inner class
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
