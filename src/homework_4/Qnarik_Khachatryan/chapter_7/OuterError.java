package homework_4.Qnarik_Khachatryan.chapter_7;
//This program will not compile

class OuterError {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10; //y is local to Inner

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    void showy() {
//        System.out.println(y);//error, y not known here
    }
}
