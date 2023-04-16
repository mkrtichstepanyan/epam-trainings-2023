package homework_18.Diana_Melkonyan;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GenericMap<Integer, String> hashTable = new GenericMap<Integer, String>();

        hashTable.put(1, "123");
        hashTable.put(2, "222");
        hashTable.put(3, "333");
        hashTable.put(4, "444");
        hashTable.put(5, "555");
        hashTable.put(6, "123");
        hashTable.put(7, "222");
        hashTable.put(8, "333");
        hashTable.put(9, "444");
        hashTable.put(10, "555");
        hashTable.put(11, "222");
        hashTable.put(12, "333");
        hashTable.put(13, "444");
        hashTable.put(14, "555");
        hashTable.put(15, "222");
        hashTable.put(16, "333");
//      hashTable.put(17,"444");


        System.out.print(hashTable);
        System.out.println();
        System.out.println(hashTable.get(6));
    }
}



