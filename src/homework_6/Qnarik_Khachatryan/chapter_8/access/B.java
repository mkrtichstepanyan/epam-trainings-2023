package homework_6.Qnarik_Khachatryan.chapter_8.access;
//A's j is not accessible here

class B extends A {
    int total;

    void sum() {
//        total = i + j;  //ERROR , j is not accessible here
    }
}
