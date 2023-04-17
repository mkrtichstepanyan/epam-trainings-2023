package homework_18.anna_manukyan;

public class GenericMapDemo {
    public static void main(String[] args) {
        GenericMap<Integer, String> userGenericMap = new GenericMap<>();
        System.out.println("***Put elements***");
        userGenericMap.put(1, "A");
        userGenericMap.put(2, "B");
        userGenericMap.put(34, "Bs");
        userGenericMap.put(50, "dsaBs");
        userGenericMap.print();
        System.out.println("***Get value by key 50***");
        String value = userGenericMap.get(50);
        System.out.println("Value is " + value);
        System.out.println("***Check if contains value***");
        System.out.println(userGenericMap.containsValue("C"));
        System.out.println("***Check if contains key***");
        System.out.println(userGenericMap.containsKey(2));
        System.out.println("***Elements count***");
        System.out.println(userGenericMap.size());
        System.out.println("***Is empty map or not***");
        System.out.println(userGenericMap.isEmpty());

        System.out.println("***Clear***");
        userGenericMap.clear();
        userGenericMap.print();
    }
}
