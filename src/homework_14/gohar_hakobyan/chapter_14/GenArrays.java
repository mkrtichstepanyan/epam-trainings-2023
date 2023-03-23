package homework_14.gohar_hakobyan.chapter_14;

public class GenArrays {
    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};
        GenArray<Integer> iOb = new GenArray<>(50, n);
//        GenArray<Integer> gens[] = new GenArray[]<Integer>[10]; incoorect
        GenArray<?> gens[] = new GenArray<?>[10]; //correct
    }
}
