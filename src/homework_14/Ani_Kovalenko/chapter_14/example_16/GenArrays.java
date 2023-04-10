package homework_14.Ani_Kovalenko.chapter_14.example_16;

public class GenArrays {
    public static void main(String[] args) {

        Integer[] n = {1, 2, 3, 4, 5};
        Gen<Integer> iOb = new Gen<>(50, n);

//        error
//        Gen<Integer>[] gens = new Gen<>[10];

        Gen<?>[] gens2 = new Gen<?>[10];
    }
}
