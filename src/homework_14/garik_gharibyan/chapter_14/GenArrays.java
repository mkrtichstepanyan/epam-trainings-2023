package homework_14.garik_gharibyan.chapter_14;

class Gen8<T extends Number> {
    T ob;
    T[] nums;

    Gen8(T ob, T[] nums) {
        this.ob = ob;
        this.nums = nums;
    }

}

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen8<Integer> iOb = new Gen8<>(50,n);

//        Gen8<Integer>[] gens = new Gen8<Integer>[10];   Error
        Gen8<?>[] gens = new Gen8<?>[10];
    }
}
