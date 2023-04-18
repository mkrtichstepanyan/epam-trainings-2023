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
        map.put(null,"abcd");
        System.out.println(map);

        GenericMap<Object,String> mapObject = new GenericMap<>();
        mapObject.put(Boolean.TRUE,"a");
        mapObject.put(Boolean.FALSE,"b");
        mapObject.put(Boolean.TRUE,"c");
        mapObject.put(Boolean.FALSE,"d");
        mapObject.put(1231,"e");
        mapObject.put(1237,"f");
        System.out.println(mapObject.get(Boolean.TRUE));
        System.out.println(mapObject.get(Boolean.FALSE));
        System.out.println(mapObject.get(1231));
        System.out.println(mapObject.get(1237));

    }
}
