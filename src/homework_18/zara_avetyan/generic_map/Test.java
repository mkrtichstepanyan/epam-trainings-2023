package homework_18.zara_avetyan.generic_map;

public class Test {
    public static void main(String[] args) {
        GenericMap<Integer, Integer> genericMap = new GenericMap<>(5);

        for (int i = 0; i < 20; i++) {
            genericMap.put(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(genericMap.get(i));
        }

        genericMap.extend();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(genericMap.get(i));
        }
    }
}
