package homework_6.Hovhannes_Abrahamyan.chapter_8.Access;

// A's j is not accessible here
class B extends A{
    int total;

    void sum() {
//        total = i + j; // Error j is not accessible here
    }
}
