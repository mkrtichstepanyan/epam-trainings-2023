package homework_18.mkrtich_stepanyan.hovhannes_gspeyan;

public class GenericMapDemo {
    public static void main(String[] args) {
//        GenericMap<Integer, String> intMap = new GenericMap<>();
//        Key<Integer> key = new Key<>();
//        long start = System.currentTimeMillis();
//        long s = System.currentTimeMillis();
//        for (int i = 0; i < 200_000; i++) {
//            intMap.put(key.of(i), i + "");
//            if(intMap.size() % 1000 == 0){
//                System.out.println(intMap.size() + " " + (System.currentTimeMillis() - s) + " " + (System.currentTimeMillis() - start));
//                s = System.currentTimeMillis();
//            }
//        }
//        System.out.println(System.currentTimeMillis() - start);

        GenericMap<String, String> map = new GenericMap<>();

        map.put("1","11");
        map.put("2","22");
        map.put("3","33");
        map.put("3","44");
        map.put("3","55");
        map.put("4","44");
        map.put("5","55");
        map.put("6","66");
        map.remove("6");

        for (String k : map.keys()) {
            System.out.println(k + " " + map.get(k));
        }
        System.out.println(map.containsKey("5"));

        System.out.println("--------------------------------");

        Key<String> key2 = new Key<>();
        GenericMap<String, String> map2 = new GenericMap<>();
        map2.put(key2.of("Hello"), "hi");
        map2.put(key2.of("increase"), "grow ");
        map2.put(key2.of("increase"), "extend");
        map2.put(key2.of("good bye"), "bye bye");
        map2.put(key2.of("problem"), "task");

        for (String k : map2.keys()) {
            System.out.println(k + " " + map2.get(k));
        }
        System.out.println(map.containsKey("5"));
        System.out.println(map.containsValue("100"));
    }
}
