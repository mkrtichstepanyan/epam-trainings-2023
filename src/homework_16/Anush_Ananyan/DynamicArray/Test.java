package homework_16.Anush_Ananyan.DynamicArray;

public class Test {

    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray(5);


        for (int i = 0; i < 10; i++) {
            myDynamicArray.add(i);
        }

        int[] arrayList = {55, 25, 100};
        int[] arrayList2 = {128, -9, 36};

        System.out.println();

        // myDynamicArray.clear();

        System.out.print("Initial dynamic array:  ");
        System.out.println(myDynamicArray.toString());
        System.out.println();

        System.out.print("The dynamic array after adding the arrayList:  ");
        myDynamicArray.addAll(arrayList);
        System.out.println(myDynamicArray.toString());
        System.out.println(myDynamicArray.getSize());
        System.out.println();

        System.out.print("the dynamic array contains 55- ");
        System.out.println(myDynamicArray.contains(55));
        System.out.print("the dynamic array contains 155- ");
        System.out.println(myDynamicArray.contains(155));
        System.out.println();

        System.out.print("the dynamic array contains arrayList: {55, 25, 100} ");
        System.out.println(myDynamicArray.containsAll(arrayList));
        System.out.print("the dynamic array contains arrayList2: {128, -9, 36} ");
        System.out.println(myDynamicArray.containsAll(arrayList2));
        System.out.println();


        System.out.println(myDynamicArray.indexOf(-6));
        System.out.println(myDynamicArray.indexOf(55));
        System.out.println();

        System.out.print("the 9 has removed: ");
        System.out.println(myDynamicArray.remove(9));
        System.out.println(myDynamicArray.getSize());
        System.out.print("the 600 has removed: ");
        System.out.println(myDynamicArray.remove(600));
        System.out.println(myDynamicArray.toString());
        System.out.println();


//        myDynamicArray.removeAll(arrayList);
//        System.out.println(myDynamicArray.getSize());
//        myDynamicArray.printArray();

        System.out.println("The dynamic Array after using trimToSize() method ");
        myDynamicArray.trimToSize();
        System.out.println(myDynamicArray.toString());
        System.out.println();

        int[] subArray = myDynamicArray.subList(2, 4);
        System.out.print("SubArray items are: ");
        for (int item : subArray) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();


        myDynamicArray.set(1, 1000);
        myDynamicArray.set(5, -3);
        myDynamicArray.set(9, 19);
        System.out.println(myDynamicArray.toString());
        System.out.println();

        System.out.print("the sorted array: ");
        myDynamicArray.sort();
        System.out.println(myDynamicArray.toString());
        System.out.println();

        System.out.print("converted arraylist to string: ");
        System.out.println(myDynamicArray.toString());
        System.out.println();

        System.out.println("The dynamic Array after removing given range: ");
        myDynamicArray.removeRange(3, 6);
        System.out.println(myDynamicArray.toString());
        System.out.println(myDynamicArray.getSize());
        System.out.println();

        System.out.println("The dynamic Array after replacing: ");
        myDynamicArray.replaceAll();
        System.out.println(myDynamicArray.toString());
        System.out.println();

        System.out.print("The given element has added by index: ");
        System.out.println(myDynamicArray.addByIndex(4, 99));
        System.out.println(myDynamicArray.toString());
        System.out.println(myDynamicArray.getSize());
        System.out.println();

        System.out.print("The given arrayList has added by index: ");
        System.out.println(myDynamicArray.addAllByIndex(4, arrayList2));
        System.out.println(myDynamicArray.getSize());
        System.out.println(myDynamicArray.toString());
    }
}
