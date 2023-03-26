package homework_14.Yeghia_Ansuryan.chapter_14.genericArrayRestrictions;

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen<Integer> iOb = new Gen<Integer>(50, n);
        Gen<?>[] gens = new Gen<?>[10];
    }
}
