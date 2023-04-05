package homework_16.anna_manukyan;


public class Test {

    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray(5);

        for (int i = 0; i < 14; i++) {
            myDynamicArray.add(i);
        }

        int[] list = {5, 1, 6};
        myDynamicArray.addAll(list);
//        myDynamicArray.clear();
        System.out.println("************");
        System.out.println("Print copy of array");
        myDynamicArray.copy();
        System.out.println(myDynamicArray.toString());
        System.out.println("**********");
        System.out.println("Print is array contains this element or not.");
        boolean contains = myDynamicArray.contains(5);
        System.out.println(contains);
        System.out.println("**********");
        System.out.println("Print index of this value in array");
        int index = myDynamicArray.indexOf(5);
        System.out.println(index);
        myDynamicArray.remove(2);
        myDynamicArray.removeAll(list);
        System.out.println("**********");
        System.out.println("Print element from index to index");
        int[] subList = myDynamicArray.subList(2, 5);
        for (int element : subList) {
            System.out.println(element);
        }
        System.out.println("**********");
        myDynamicArray.set(2, 100);
        myDynamicArray.sort();
        myDynamicArray.removeRange(0, 15);
        myDynamicArray.replaceAll(new int[]{5, 6, 7});
        myDynamicArray.containsAll(new int[]{5, 9, 7});
        System.out.println("**********");
        System.out.println("Print array");
        System.out.println(myDynamicArray.toString());
    }
}
