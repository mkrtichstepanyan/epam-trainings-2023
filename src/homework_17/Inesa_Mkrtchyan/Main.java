package homework_17.Inesa_Mkrtchyan;

public class Main {
    public static void main(String[] args) {
        LinkedListGeneric<Integer> myList = new LinkedListGeneric<Integer>();
        myList.add(5);
        myList.add(6);
        myList.add(8);
        myList.add(7);
        myList.set(2,100);
        Integer[] a = {1,2,3};
        myList.addAll(a);
        myList.Print();
        System.out.println(myList.get(100));
    }
}