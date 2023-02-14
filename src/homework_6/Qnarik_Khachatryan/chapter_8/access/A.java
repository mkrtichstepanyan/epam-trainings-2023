package homework_6.Qnarik_Khachatryan.chapter_8.access;

//create a superclass

//private members remain private to their class
class A {
    int i; //default access
    private int j; //private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }

}
