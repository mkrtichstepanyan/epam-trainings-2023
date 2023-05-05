package homework_19.Diana_Melkonyan;

import java.util.Iterator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

//        System.out.println(list.forAll(x -> x > 2));

//        ExtendedList<Integer> mapper = list.map(x -> x * 5);
//        mapper.forEach(System.out::println);
//
//
//        list.fill(()-> 44,3);
//        list.forEach(System.out::println);

//        System.out.println(list.reduce(Integer::min,Integer.MAX_VALUE));
//        System.out.println(list.reduce(Integer::sum,0));


        System.out.println(list.partition(x->x % 2==0));


    }
}
