package homework_16.anna_manukyan.generic_dynamic_array;


public class Test {

    public static void main(String[] args) {
        DynamicArray<String> myDynamicArray = new DynamicArray<String>(5) {
            @Override
            public Object clone(Object object) {
                return object;
            }
        };

        for (int i = 0; i < 14; i++) {
            myDynamicArray.add(String.valueOf(i));
        }

        String[] list = {"5", "50"};
        myDynamicArray.addAll(list);
        System.out.println("************");
        System.out.println("Print copy of array");
        myDynamicArray.copy();
        System.out.println(myDynamicArray.toString());
        System.out.println("**********");
        System.out.println("Print is array contains this element or not.");
        boolean contains = myDynamicArray.contains("apple");
        System.out.println(contains);
        System.out.println("**********");
        System.out.println("Print index of  value in array");
        int index = myDynamicArray.indexOf("banana");
        System.out.println(index);
        System.out.println(myDynamicArray.toString());
        myDynamicArray.remove("5");
        myDynamicArray.removeAll(list);
        System.out.println("**********");
        System.out.println("Print element from index to index");
        myDynamicArray.subList(2, 5);
        System.out.println("**********");
        myDynamicArray.set(2, "100");
        myDynamicArray.sort();
        System.out.println("*******************");
        System.out.println("Remove elements");
        myDynamicArray.removeRange(2, 7);
        System.out.println(myDynamicArray.toString());
        System.out.println("*******************");
        System.out.println("Replace elements from index");
        myDynamicArray.replaceAll(new String[]{"5", "6", "7"}, 0);
        System.out.println(myDynamicArray.toString());
        System.out.println("*******************");
        System.out.println("Print if array contains this elements");
        System.out.println(myDynamicArray.containsAll(new String[]{"5", "barev"}));
        System.out.println("**********");
        System.out.println("Trim array to size");
        myDynamicArray.trimToSize();
        System.out.println(myDynamicArray.toString());
        System.out.println("**************");
        System.out.println("Add element by index");
        myDynamicArray.addByIndex(2, "10000");
        myDynamicArray.addByIndex(3, "banana");
        System.out.println("**************");
        System.out.println("Add elements starting from  index");
        myDynamicArray.addAllByIndex(2, new String[]{"apple", "orange"});
        System.out.println(myDynamicArray.toString());
//        myDynamicArray.clear();
        System.out.println("************");
        System.out.println("Array clone");
        System.out.println(myDynamicArray.toString());
    }
}
