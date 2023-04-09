package homework_16.aram_mehrabyan.generic_dynamic_array;



public class Test {

    public static void main(String[] args) {
        String[] str = {"Aram", "Noy", "Lusine"};
        String[] str1 = {"Gor", "Aram", "Noy"};
        String[] str3 = {"Karine", "Mariam", "Karen"};

        DynamicArray<String> myDynamicArray = new DynamicArray<>(5);
        myDynamicArray.add("Armen");
        myDynamicArray.add("Arthur");
        myDynamicArray.add("Gor");
        myDynamicArray.add(1, "Monika");
        myDynamicArray.addAll(str);
        myDynamicArray.sort();
       // myDynamicArray.removeAll(str1);
       /* myDynamicArray.remove(4);
        myDynamicArray.clear();
        myDynamicArray.contains("Aram");
        myDynamicArray.indexOf("Gor");
        myDynamicArray.containsAll(str1);
        myDynamicArray.set("Mike", 3);
        myDynamicArray.sublist(2, 6);
        myDynamicArray.addAllByIndex(3, str3);
        myDynamicArray.removeRange(1, 4);
        myDynamicArray.replaceAll("Aram", "Argam");

        */
        for (int i = 0; i < myDynamicArray.getSize(); i++) {
            System.out.println(myDynamicArray.get(i));
        }
        System.out.println(myDynamicArray.toString());


    }

}
