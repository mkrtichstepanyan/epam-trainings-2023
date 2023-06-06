package homework_19.TatevKocharyan.chapter30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList=new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        Stream<String> myStream=myList.stream();
        Iterator<String> itr=myStream.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
