package homework_16.TatevKocharyan.genericDynamicArray;

import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        GenericDynamicArray <Integer> genericDynamicArray = new GenericDynamicArray();
        GenericDynamicArray<String > genericDynamicArray1 = new GenericDynamicArray();
        genericDynamicArray.add(55);
        genericDynamicArray.add(66);
        genericDynamicArray.add(77);

        genericDynamicArray1.add("78");
        genericDynamicArray1.add("98");
        genericDynamicArray1.trimToSize();
        genericDynamicArray.print();
        genericDynamicArray.addByIndex(2, 55);

        genericDynamicArray.bubbleSort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                 if (o1 > o2) {
                    return -1;
                } else if (o1 == o2) {
                    return 0;
                }
                return 1;
            }

        });
        Object[] genericDynamicArray3 = genericDynamicArray.subList(2, 6);
        for (int i = 0; i < genericDynamicArray3.length - 1; i++) {
            System.out.println(genericDynamicArray3[i] + " ");
        }

        Object[] clone = genericDynamicArray.clone();
        print(clone);

    }


    public static void print(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            System.out.print(array[i] + " ");

        }
    }
}