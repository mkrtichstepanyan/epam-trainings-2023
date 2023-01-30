package homework_4.Vladimir_Vanyan.chapter_7;

class Outher3 {
    int outher_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner3 {
                void display() {
                    System.out.println("display: outher_x = " + outher_x);
                }
            }
            Inner3 inner = new Inner3();
            inner.display();
        }
    }
}

class InnerClassDemo3 {
    public static void main(String[] args) {
        Outher3 outher = new Outher3();
        outher.test();
    }
}
