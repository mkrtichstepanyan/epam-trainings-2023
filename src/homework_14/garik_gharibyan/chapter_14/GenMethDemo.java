package homework_14.garik_gharibyan.chapter_14;

public class GenMethDemo {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (inIs(2,nums)){
            System.out.println("2 is in nums");
        }
        if (!inIs(7,nums)){
            System.out.println("7 is not in nums");
        }
        System.out.println();

        String[] strs = {"one","two","tree","four","five"};

        if (inIs("one",strs)){
            System.out.println("one is in strs");
        }
        if (!inIs("seven",strs)){
            System.out.println("seven is not in strs");
        }

//        if (inIs("one",nums)){
//            System.out.println("one is in strs");    cen not compile
//        }

    }

    static <T extends Comparable<T>, V extends T> boolean inIs(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }
}
