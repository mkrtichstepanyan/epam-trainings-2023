package homework_18.argishti_Mesropyan;



import java.util.List;
import java.util.Map;

public class GenericMap <K, V> {
    private static final  int DEFAULT_CAPACITY = 16;
    private int capacity;
    private int size;
    private List<Map.Entry>[] mapList;

    public GenericMap(){
        this(DEFAULT_CAPACITY);
    }

    public GenericMap(int capacity){
        capacity = capacity;
        size = 0;
        mapList = new List[capacity];
    }
//    public void put(K key, V value){
//        int index =
//    }


}
