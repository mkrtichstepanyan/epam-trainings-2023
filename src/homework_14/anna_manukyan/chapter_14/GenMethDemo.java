package homework_14.anna_manukyan.chapter_14;

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
        Integer nums[] = {1, 2, 3, 4, 5};

        if (isIn(2, nums)) {
            System.out.println("2 is in nums");
        }

        if (!isIn(7, nums)) {
            System.out.println("7 is not in nums");
            System.out.println();
        }
        String strs[] = {"one", "two", "tree", "four", "five"};
        if (isIn("two", strs)) {
            System.out.println("two is in strs");
        }

        if (!isIn("seven", strs)) {
            System.out.println("seven is not in strs");
        }

    }
}
