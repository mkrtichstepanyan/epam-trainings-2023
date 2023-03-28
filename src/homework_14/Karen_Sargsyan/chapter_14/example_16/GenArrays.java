package homework_14.Karen_Sargsyan.chapter_14.example_16;

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen<Integer> iOb = new Gen<Integer>(50, n);
        Gen<?>[] gens = new Gen<?>[10];
    }

}
