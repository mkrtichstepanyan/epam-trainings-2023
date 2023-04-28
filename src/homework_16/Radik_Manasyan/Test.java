package homework_16.Radik_Manasyan;

public class Test {

    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray(5);
        int[] numbers = {5, 9, 3};
        myDynamicArray.addAll(numbers);
        for (int i = 0; i < 14; i++) {
            myDynamicArray.add(i);
        }
        myDynamicArray.addAll(numbers);
        System.out.println(myDynamicArray.containsAll(numbers));
        int indexOf = myDynamicArray.indexOf(9);
        System.out.println("indexOf-----> " + indexOf);
        myDynamicArray.remove(5);
        System.out.println(myDynamicArray.getSize());
        myDynamicArray.removeAll(numbers);

        System.out.println(myDynamicArray.isEmpty());
        int[] ints = myDynamicArray.subList(3, 5);

        for (int i : ints) {
            System.out.print(i + ": ");
        }
        System.out.println();
        myDynamicArray.set(15, 222);

        myDynamicArray.sort();
        System.out.println(myDynamicArray.toString());

        myDynamicArray.trimToSize();

        myDynamicArray.removeRange(5);
        int[] cloneArray = myDynamicArray.clone();
        for (int i : cloneArray) {
            System.out.print(i + ": ");
        }
        myDynamicArray.replaceAll();
        System.out.println();
        myDynamicArray.addByIndex(3,333);

        myDynamicArray.addAllByIndex(2, numbers);

        System.out.println(myDynamicArray.toString());

        myDynamicArray.clear();

    }
}
