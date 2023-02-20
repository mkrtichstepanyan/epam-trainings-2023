package homework_6.Ani_Barseghyan.chapter_8.Simple_Inheritance;

class B extends A {
    public int k;

    void show_K() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
