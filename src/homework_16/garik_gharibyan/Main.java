package homework_16.garik_gharibyan;

public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(0);

        System.out.println("First Array: " + dynamicArray);
        System.out.println("Array Size: " + dynamicArray.getSize());

        DynamicArray clone = dynamicArray.clone();
        System.out.println("Clone: " + clone);
        System.out.println("Clone size: " + clone.getSize());

        System.out.println("Contains int 1? :" + dynamicArray.contains(1));
        System.out.println("indexOf 15? : " + dynamicArray.indexOf(15));
        System.out.println("isEmpty: " + dynamicArray.isEmpty());

        System.out.println("SubList(2,9): " + dynamicArray.subList(2, 9));

        System.out.println(dynamicArray + " " + dynamicArray.getSize());

        DynamicArray dynamicArray1 = new DynamicArray();
        dynamicArray1.add(11);
        dynamicArray1.add(12);
        dynamicArray1.add(13);
        dynamicArray.addAll(dynamicArray1);
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());


        System.out.println("----------------------------------");
        System.out.println("Test remove(index = 12)");
        dynamicArray.remove(12);
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());

        System.out.println("----------------------------------");
        System.out.println("Test addByIndex(index = 11,value = 100)");
        dynamicArray.addByIndex(11,100);
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());

        System.out.println("----------------------------------");
        System.out.println("Test addAll(int[])");
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());
        System.out.println("[100,101,102]");
        int[] ints = {100,101,102};
        dynamicArray.addAll(ints);
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());

        System.out.println("----------------------------------");
        System.out.println("Test addAll(DynamicArray)");
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());
        System.out.println(dynamicArray1 + " size: " + dynamicArray1.getSize());
        dynamicArray.addAll(dynamicArray1);
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());

        System.out.println("----------------------------------");
        System.out.println("Test addAllByIndex(int,DynamicArray)");
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());
        System.out.println(dynamicArray1 + " size: " + dynamicArray1.getSize());
        dynamicArray.addAllByIndex(17,dynamicArray1);
        System.out.println(dynamicArray + " size: " + dynamicArray.getSize());


    }
}
