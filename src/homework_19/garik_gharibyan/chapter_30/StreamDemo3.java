package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        Double reduce = myList.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b);

        System.out.println("Product of square root: " + reduce);
    }
}
