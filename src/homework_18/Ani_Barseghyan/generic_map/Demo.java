package homework_18.Ani_Barseghyan.generic_map;

public class Demo {
    public static void main(String[] args) {
        GenericMap<String, Double> genericMap = new GenericMap<>();
        genericMap.put("John Doe", 343.34);
        genericMap.put("Tom Smith", 123.22);
        genericMap.put("Jane Baker", 1343.00);
        genericMap.put("Tod Hall", 99.22);
        genericMap.put("Ralph Smith", -19.08);

        System.out.println(genericMap.get("John Doe"));
    }
}
