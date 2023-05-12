package homework_19.garik_gharibyan.chapter_30;

import java.util.ArrayList;
import java.util.Iterator;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");

        Iterator<String> iterator = myList.stream().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
