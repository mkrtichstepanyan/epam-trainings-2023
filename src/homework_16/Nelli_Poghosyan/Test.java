package homework_16.Nelli_Poghosyan;

public class Test {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(10);
        array.add(12);
        array.add(2);
        array.add(23);
        int[] arr = {12,12,12};
        array.addAll(arr);
        for (int i = 0 ; i < array.getSize(); i++){
            System.out.println(array.get(i));
        }
        System.out.println(array.indexOf(2));
    }
}