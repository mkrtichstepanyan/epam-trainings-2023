package homework_6.Anna_Manukyan.chapter_8;

//Create a subclasses by extending from AWithOverride
public class BWithOverride extends AWithOverride {
    int k;

    BWithOverride(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void showK() {
        System.out.println("k is " + k);
    }

    void sumIJK() {
        System.out.println("i+j+k:" + (i + j + k));
    }

}
