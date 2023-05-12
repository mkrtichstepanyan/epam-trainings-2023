package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.Spliterator;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");

        Spliterator<String> spliterator = myList.stream().spliterator();
        while (spliterator.tryAdvance(n -> System.out.println(n)));
    }
}