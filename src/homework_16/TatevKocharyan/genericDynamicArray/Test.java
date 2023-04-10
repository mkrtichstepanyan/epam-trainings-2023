package homework_16.TatevKocharyan.genericDynamicArray;

public class Test {

    public static void main(String[] args) {
        GenericDynamicArray genericDynamicArray = new GenericDynamicArray();
        GenericDynamicArray genericDynamicArray1 = new GenericDynamicArray();
        genericDynamicArray.add(55);
        genericDynamicArray.add(66);
        genericDynamicArray.add(77);
        genericDynamicArray.add("hello");
        genericDynamicArray.add("he");
        genericDynamicArray.add("she");

        genericDynamicArray1.add(78);
        genericDynamicArray1.add("hhhhh");
        genericDynamicArray1.add(98);
        genericDynamicArray1.trimToSize();
        genericDynamicArray.addAllByIndex(2, genericDynamicArray1.getArray());
        genericDynamicArray.print();
        genericDynamicArray.addByIndex(2, 55);


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