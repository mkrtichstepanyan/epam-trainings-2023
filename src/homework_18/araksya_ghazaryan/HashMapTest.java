package homework_18.araksya_ghazaryan;

public class HashMapTest {
    public static void main(String[] args) {
        GenMap<String, Integer> genMap = new GenMap<>();
        genMap.put("Maria", 1992);
        genMap.put("Ara", 1995);
        genMap.put("Narek", 2003);
        genMap.put("Nare", 1986);
        genMap.put("Gor", 2007);
        System.out.println(genMap.get("Maria"));
    }
}