package homework_16.Roza_Petrosyan.dynamic_array_task;
public class Test {
    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray(5);
        for (int i = 0; i < 10; i++) {
            myDynamicArray.add(i);
        }
        System.out.println("Dynamic array after add() method (0-9 items): ");
        System.out.println(myDynamicArray);
        System.out.println();

        int[] addAllArray = {5, 4, 8, -7, 3, 55, 78};
        myDynamicArray.addAll(addAllArray);
        System.out.println("Dynamic array after addAll() method ({5, 4, 8, -7, 3, 55, 78}):");
        System.out.println(myDynamicArray);
        System.out.println();

        System.out.println("Dynamic array after clone() method:");
        myDynamicArray.clone();
        System.out.println(myDynamicArray);
        System.out.println();

        System.out.println("Dynamic array after contains(-56) method:");
        System.out.println(myDynamicArray.contains(-56));
        System.out.println();

        System.out.println("Dynamic array after containsAll(new int[]{-7, 5, 0}) method:");
        int[] arr = {-7, 5, 0};
        System.out.println(myDynamicArray.containsAll(arr));
        System.out.println();

        System.out.println("Dynamic array after indexOf(-7) method:");
        System.out.println(myDynamicArray.indexOf(-7));
        System.out.println();

        System.out.println("Dynamic array after remove(0) method:");
        System.out.println("Value of removed element is: " + myDynamicArray.remove(0));
        System.out.println(myDynamicArray);
        System.out.println();

        System.out.println("Dynamic array after isEmpty() method:");
        System.out.println(myDynamicArray.isEmpty());
        System.out.println();

        System.out.println("Dynamic array after subList(9,11) method:");
        System.out.println(myDynamicArray.subList(9,11));
        System.out.println();

        System.out.println("Dynamic array after set(3, -111) method:");
        System.out.println("Value of movable element is: " + myDynamicArray.set(3, -111));
        System.out.println(myDynamicArray);
        System.out.println();

        System.out.println("Dynamic array after sort() method:");
        myDynamicArray.sort();
        System.out.println(myDynamicArray);
        System.out.println();

        System.out.println("Dynamic array after removeRange(9,12) method:");
        myDynamicArray.removeRange(9, 12);
        System.out.println(myDynamicArray);
        System.out.println();

        System.out.println("Dynamic array after replaceAll(e->e+100) method:");
        myDynamicArray.replaceAll(e->e+100);
        System.out.println(myDynamicArray);
        System.out.println();


        System.out.println("Dynamic array after removeAll(new int[]{-11,93,12})) method:");
        System.out.println(myDynamicArray.removeAll(new int[]{-11,93,12}));
        System.out.println(myDynamicArray);
        System.out.println();

        System.out.println("Dynamic array after clear() method:");
        myDynamicArray.clear();
        System.out.println(myDynamicArray);
    }
}
