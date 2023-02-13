package chapter_8.Hovhannes_Abrahamyan.Access;

// A's j is not accessible here
class B extends A{
    int total;

    void sum() {
//        total = i + j; // Error j is not accessible here
    }
}
