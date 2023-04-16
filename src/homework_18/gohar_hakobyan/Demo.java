package homework_18.gohar_hakobyan;

public class Demo {
    public static void main(String[] args) {
        GenericMap.Node<String, Integer> map
                = new GenericMap.Node<>();
        map.put("Number one", 1);
        map.put("Number two", 2);
        map.put("Number three", 3);
        map.put("Number four", 4);
        map.put("Number five", 5);

        System.out.println(map.get("Number one"));
    }
}
