package homework_14.TatevKocharyan.chapter14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        if (isIn(2, nums)) {
            System.out.println("2 is in nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("2 is in nums");
        }

        String[] strs = {"one", "two", "three", "four", "five"};

        if (isIn("two", strs)) {
            System.out.println("2 is in nums");
        }
        if (isIn("seven", strs)) {
            System.out.println("2 is in nums");
        }

    }
}
