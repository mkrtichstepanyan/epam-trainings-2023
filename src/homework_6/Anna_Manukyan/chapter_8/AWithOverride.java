package homework_6.Anna_Manukyan.chapter_8;

//A simple example of inheritance
public class AWithOverride {
    int i;
    int j;

    AWithOverride(int a, int b) {
        i = a;
        j = b;
    }

    void showIJ() {
        System.out.println("i and j: " + i + " " + j);
    }
}
