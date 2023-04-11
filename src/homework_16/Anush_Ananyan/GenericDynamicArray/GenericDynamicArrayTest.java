package homework_16.Anush_Ananyan.GenericDynamicArray;

public class GenericDynamicArrayTest {
    public static void main(String[] args) {
        GenericDynamicArray<String> genArr = new GenericDynamicArray<>(3);
        String[] stringList = {"X", "Y", "Z"};
        String[] stringList2 = {"H", "I", "J"};

        genArr.add("A");
        genArr.add("D");
        genArr.add("E");
        genArr.add("B");
        genArr.add("C");
        genArr.add("G");


        System.out.print("The initial array is: ");
        genArr.printArray();
        System.out.println();

        System.out.print("The sorted array is: ");
        genArr.sort();
        genArr.printArray();
        System.out.println();

        System.out.print("The size of array is: ");
        System.out.println(genArr.getSize());
        System.out.println();

        System.out.print("The array after adding stringList: ");
        genArr.addAll(stringList);
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.println();


        System.out.print("The element with 4 index is: ");
        System.out.println(genArr.get(4));
        System.out.println();

//      System.out.print("The element with 14 index is: ");
//      System.out.println(genArr.get(14));

//       genArr.clear();
//       genArr.printArray();
//       System.out.print("The array is empty: ");
//       System.out.println(genArr.isEmpty());

        System.out.println("The cloned array after adding 'zzz' ");
        GenericDynamicArray<String> clonedArray = genArr.cloneArr();
        clonedArray.add("zzz");
        clonedArray.printArray();
        System.out.println("The original array: ");
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.println();

        System.out.print("The array is contain 'Z': ");
        System.out.println(genArr.contains("Z"));
        System.out.print("The array is contain 'M': ");
        System.out.println(genArr.contains("M"));
        System.out.println();

        System.out.print("The array is contain stringList: ");
        System.out.println(genArr.containsAll(stringList));
        System.out.print("The array is contain stringList2: ");
        System.out.println(genArr.containsAll(stringList2));
        System.out.println();

        System.out.print("The index of 'C' element is: ");
        System.out.println(genArr.indexOf("C"));
        System.out.print("The index of 'M' element is: ");
        System.out.println(genArr.indexOf("M"));
        System.out.println();

        System.out.print("The 'C' element removed: ");
        System.out.println(genArr.remove("C"));
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.print("The 'F' element removed: ");
        System.out.println(genArr.remove("F"));
        System.out.println(genArr.getSize());
        System.out.println();

        System.out.print("The array after removing stringList: ");
        genArr.removeAll(stringList);
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.println();

        System.out.print("The array is empty: ");
        System.out.println(genArr.isEmpty());
        System.out.println();

        Object[] subArray = genArr.subList(2, 4);
        System.out.print("SubArray items are: ");
        for (Object item : subArray) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();

        System.out.print("The array after setting some elements: ");
        genArr.set(3, "K");
        genArr.set(4, "L");
        genArr.set(0, "P");
        //genArr.set(-5, "L");
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.println();

        System.out.print("The array after using trimToSize method: ");
        genArr.trimToSize();
        genArr.printArray();
        System.out.println();

        System.out.print("Converted arraylist to string: ");
        System.out.println(genArr.toString());
        System.out.println();

        System.out.print("The Array after removing given range: ");
        genArr.removeRange(1, 3);
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.println();

        System.out.print("The 'T' element has added by 2 index: ");
        System.out.println(genArr.addByIndex(2, "T"));
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.print("The 'T' element has added by 50 index: ");
        System.out.println(genArr.addByIndex(50, "T"));
        System.out.println();

        System.out.print("The stringList2 has added by 1 index: ");
        System.out.println(genArr.addAllByIndex(1, stringList2));
        genArr.printArray();
        System.out.println(genArr.getSize());
        System.out.print("The stringList2 has added by 19 index: ");
        System.out.println(genArr.addAllByIndex(19, stringList2));

    }
}
