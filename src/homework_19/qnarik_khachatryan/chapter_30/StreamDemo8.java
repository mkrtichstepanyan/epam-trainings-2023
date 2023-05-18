package homework_19.qnarik_khachatryan.chapter_30;

//Use an iterator with a stream

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

class StreamDemo8 {
    public static void main(String[] args) {

        //Create a list of Strings.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        //Obtain a Stream to the array list.
        Stream<String> myStream = myList.stream();

        //Obtain an iterator tp the stream.
        Iterator<String> itr = myStream.iterator();

        //Iterate the elements in the stream
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
