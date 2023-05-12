package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {

    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.4);
        myList.add(18.8);
        myList.add(24.5);
        myList.add(17.51);

        System.out.println("original value in my list: ");
        myList.stream().forEach(n -> System.out.println(n));

        IntStream intStream = myList.stream().mapToInt(n -> (int) Math.ceil(n));
        System.out.println("The ceilings of the values in my list: ");
        intStream.forEach(n -> System.out.println(n));
    }
}
