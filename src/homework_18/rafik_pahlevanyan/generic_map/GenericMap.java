package homework_18.rafik_pahlevanyan.generic_map;

import java.util.Set;

public class GenericMap<K, V> {
    private MyMap<K, V> map;


    public GenericMap() {
        map = new MyMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }



    public void extend(MyMap<K, V> otherMap) {
        for (K key : otherMap.keySet()) {
            V value = otherMap.get(key);
            map.put(key, value);
        }
    }

    public Set<K> keySet() {
        return map.keySet();
    }
}


