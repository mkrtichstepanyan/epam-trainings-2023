package homework_19.TatevKocharyan.chapter30;

import homework_1.Hayk_Davtyan.Array;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Original list " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("minimum value " + integer));


        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println("maximum value " + maxVal.get());
        }


        myStream=myList.stream().sorted();
        System.out.print("sorted stream: ");
        myStream.forEach((n)-> System.out.print(n+" "));
        System.out.println();

        myStream=myList.stream().sorted().filter((n)->(n%2)==1);
        System.out.print("Odd values: ");
        myStream.forEach((n)-> System.out.print(n+" "));
        System.out.println();

        myStream=myList.stream().sorted().filter((n)->(n%2)==1).filter((n)->n>5);
        System.out.println("Odd values greater than 5: ");
        myStream.forEach((n)-> System.out.print(n+" "));


    }

}
