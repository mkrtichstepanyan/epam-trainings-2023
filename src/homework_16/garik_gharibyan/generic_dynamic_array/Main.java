package homework_16.garik_gharibyan.generic_dynamic_array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenericDynamicArray<Integer> genDynamicArray = new GenericDynamicArray<>();

        genDynamicArray.add(1);
        genDynamicArray.add(2);
        genDynamicArray.add(3);
        genDynamicArray.add(8);
        genDynamicArray.add(9);
        genDynamicArray.add(4);
        genDynamicArray.add(5);
        genDynamicArray.add(6);
        genDynamicArray.add(7);
        genDynamicArray.add(7);
        genDynamicArray.add(0);

        System.out.println("First Array: " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("1.  getSize() -> " + genDynamicArray.getSize());
        printLine();

        genDynamicArray.addByIndex(2, 100);
        System.out.println("2   addByIndex(index = 2,value = 100) -> " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        Integer[] integers = {10, 20, 30};
        genDynamicArray.addAll(integers);
        System.out.println("3   addAll(new T[]) -> " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        GenericDynamicArray<Integer> genDinArray = new GenericDynamicArray<>();
        genDinArray.add(100);
        genDinArray.add(200);
        genDinArray.add(300);
        genDynamicArray.addAll(genDinArray);
        System.out.println("4.  addAll(new GenericDynamicArray()) - > " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        genDynamicArray.addAllByIndex(14,genDinArray);
        System.out.println("5.  addAllByIndex(index = 14,new GenericDynamicArray()) - > " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("6.  get(5) -> " + genDynamicArray.get(5) + " " + genDynamicArray);
        printLine();

        genDynamicArray.remove(2);
        System.out.println("7.  remove(index = 2) - > " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        genDynamicArray.removeRange(16,19);
        System.out.println("8.  remove(fromIndex = 16,toIndex = 19) - > " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("9.  removeObject(7) -> " + genDynamicArray.removeObject(7) + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        GenericDynamicArray<Integer> genDinArray1 = new GenericDynamicArray<>();
        genDinArray1.add(1);
        genDinArray1.add(5);
        genDinArray1.add(100);
        genDinArray1.add(200);
        genDinArray1.add(2000);
        genDynamicArray.removeAll(genDinArray1);
        System.out.println("10. removeAll(new GenericDynamicArray) -> " +genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("11. indexOf(200) -> " + genDynamicArray.indexOf(200) + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("12. contains(200) -> " + genDynamicArray.contains(200) + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        Integer[] integers1 = {2,3,300,0};
        System.out.println("13. containsAll(new T[]) -> " + genDynamicArray.containsAll(integers1) + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("14. subList(fromIndex=2,toIndex=6) -> " + genDynamicArray.subList(2,6) + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("15. isEmpty() -> " + genDynamicArray.isEmpty() + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        System.out.println("16. set(index=10,value=777) -> " + genDynamicArray.set(10,777) + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        genDynamicArray.sort();
        System.out.println("17. sort() -> " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        GenericDynamicArray<Integer> newGenArray = new GenericDynamicArray<>();
        newGenArray.add(13);
        newGenArray.add(23);
        newGenArray.add(85);
        newGenArray.add(1);
        newGenArray.add(20);
        newGenArray.add(12);
        newGenArray.add(5);
        genDynamicArray.replaceAll(newGenArray);
        System.out.println("18. replaceAll(new GenericDynamicArray) -> " + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        genDynamicArray.trimToSize();
        genDynamicArray.sort();
        System.out.println("19. trimToSize() -> " + " " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

        GenericDynamicArray<Integer> clonedArray = genDynamicArray.clone();
        genDynamicArray.set(2,1000);
        System.out.println("20. clone() -> " + "oldArray: " + genDynamicArray + genDynamicArray.sizeAndLength());
        System.out.println("               " + "newArray: " + clonedArray + clonedArray.sizeAndLength());
        printLine();

        genDynamicArray.clear();
        System.out.println("21. clear() -> " + genDynamicArray + genDynamicArray.sizeAndLength());
        printLine();

    }


    private static void printLine() {
        System.out.println("---------------------");
    }

}
