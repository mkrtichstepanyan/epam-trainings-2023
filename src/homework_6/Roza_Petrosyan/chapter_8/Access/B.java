package homework_6.Roza_Petrosyan.chapter_8.Access;


// A.java's j is not accessible here
class B extends A{
    int total;

    void sum() {
//        total = i + j; // Error j is not accessible here
    }
}
