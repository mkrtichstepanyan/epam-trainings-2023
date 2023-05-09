package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        Stream<Double> sqrtRootStream = myList.stream().map(Math::sqrt);
        Double productOfSqrRoots = sqrtRootStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("Product of square is: " + productOfSqrRoots);
    }
}
