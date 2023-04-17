package homework_18.Nona_Asatryan.genericMap;

public class GenericMapDemo {
    public static void main(String[] args) {
        GenericMap<Integer, String> genericMap= new GenericMap<>();

        genericMap.put(1, "apple");
        genericMap.put(2, "banana");
        genericMap.put(2, "kiwi");
        genericMap.put(2, "orange");
        genericMap.put(3, "cherry");
        genericMap.put(4, "watermelon");

        System.out.println("Map size: " + genericMap.size());
        genericMap.print();

        System.out.println("**********************");
        System.out.println(genericMap.get(3));
        System.out.println(genericMap.get(2));

        System.out.println("**********************");
        System.out.println(genericMap.remove(1));
        genericMap.print();

        System.out.println("**********************");
        System.out.println(genericMap.containsKey(1));

        System.out.println("**********************");
        System.out.println(genericMap.containsValue("cherry"));

        System.out.println("**********************");
        genericMap.clear();
        genericMap.print();
    }

}
