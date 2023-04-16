package homework_18.garik_gharibyan;

public class Main {
    public static void main(String[] args) {
        GenericMap<Integer,String> map = new GenericMap<>();
        map.put(1,"B");
        map.put(2,"C");
        map.put(3,"D");
        map.put(0,"A");
        map.put(4,"F");
        System.out.println(map + " Size: " + map.getSize());
        map.put(19,"1919");
        map.put(20,"2020");
        map.put(84,"8484");
        System.out.println(map + " Size: " + map.getSize());

        System.out.println(map.get(84));

        GenericMap<String,String> mapStr = new GenericMap<>();
        mapStr.put("hello","barev");
        mapStr.put("yes","ayo");
        mapStr.put("no","voch");
        mapStr.put("get","vercnel");
        System.out.println(mapStr);
        System.out.println(mapStr.get("get"));


    }
}
