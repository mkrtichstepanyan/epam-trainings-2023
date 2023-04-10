package homework_16.Ani_Barseghyan;

public class DynamicDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        int[] newArr = {15, 16, 17, 18};

        System.out.println("Add to array");
        for (int i = 0; i < 14; i++) {
            dynamicArray.add(i + 1);
        }
        System.out.println(dynamicArray.toString());
        System.out.println();

        System.out.println("Add new array to array");
        dynamicArray.addAll(newArr);
        System.out.println(dynamicArray.toString());
        System.out.println();

        System.out.println("Clone array");
        dynamicArray.cloneArr();
        System.out.println(dynamicArray.toString());
        System.out.println();

        System.out.println("Check if array contains given number");
        System.out.println(dynamicArray.contains(50) + " 50 is not in the array");
        System.out.println(dynamicArray.contains(5) + " 5 is in the array");
        System.out.println();

        System.out.println("Check if array contains another array");
        System.out.println(dynamicArray.containsAll(newArr));
        System.out.println();

        System.out.println("Index of given number");
        System.out.println(dynamicArray.indexOf(13));
        System.out.println();

        System.out.println("Remove given number from array");
        dynamicArray.remove(12);
        System.out.println(dynamicArray.toString());
        System.out.println();

        System.out.println("Remove all from array");
        dynamicArray.removeAll(newArr);
        System.out.println();

        System.out.println("Replace one number with given value");
        dynamicArray.set(1, 20);
        System.out.println(dynamicArray.toString());
        System.out.println();

        System.out.println("Sort array");
        dynamicArray.sort();
        System.out.println(dynamicArray.toString());

        System.out.println("Trim to size");
        dynamicArray.trimToSize();
        System.out.println(dynamicArray.toString());

        System.out.println("Remove given range from array");
        dynamicArray.removeRange(4, 6);
        System.out.println(dynamicArray.toString());
        System.out.println();


        System.out.println("Replace all elements in array by adding +1");
        System.out.println("Before " + dynamicArray.toString());
        dynamicArray.replaceAll();
        System.out.println("After " + dynamicArray.toString());
        System.out.println();

        System.out.println("Clear array");
        dynamicArray.clear();
        System.out.println(dynamicArray.toString());
    }
}
