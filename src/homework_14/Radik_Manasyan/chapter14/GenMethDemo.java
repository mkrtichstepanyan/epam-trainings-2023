package homework_14.Radik_Manasyan.chapter14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            System.out.println("Число 2 содержится в масиве nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("Число 7 отсутствует в масиве nums");
        }
        System.out.println();

        String[] strs = {"one", "two", "three", "four", "five"};

        if (isIn("two", strs)) {
            System.out.println("two содержится в масиве strs");
        }
        if (!isIn("seven", strs)) {
            System.out.println("seven отсутствует в масиве strs");
        }
        System.out.println();
    }
}
