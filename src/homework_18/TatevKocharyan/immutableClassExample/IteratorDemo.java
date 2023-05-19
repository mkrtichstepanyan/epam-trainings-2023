package homework_18.TatevKocharyan.immutableClassExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("F");
        al.add("G");
        al.add("D");
        Iterator<String> itr=al.iterator();
        while (itr.hasNext()){
            String element=itr.next();
            System.out.println(element+" ");
        }
        System.out.println();

        ListIterator<String> litr=al.listIterator();
        while (litr.hasNext()){
            String element=litr.next();
            litr.set(element);

        }
    }
}
