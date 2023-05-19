package homework_18.aram_mehrabyan;


import java.util.*;

public class GenericMap<K,V> {
    List<Entry<K,V>>[] list;
    int size;

    public GenericMap() {
       this.list = new List[16];
    }

    public void put(K key, V value) {
        if (size >= list.length) {
            extend();
        }
        int index = getIndex(key) % list.length;
        if (list[index] == null) {
            list[index] = new LinkedList<>();
            list[index].add(new Entry(key, value));
            size++;

        } else {
            for (Entry entry : list[index]) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    size++;
                    return;
                }
            }
            list[index].add(new Entry(key, value));
            size++;

        }
    }

    public V get(K key) {
        int index = getIndex(key) % list.length;
        for (Entry<K,V> entry : list[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public int getIndex(K key) {
        return key.hashCode();
    }

    public void extend() {
        List<Entry<K,V>>[] oldMap = list;
        list = new List[size * 2];
        for (int i = 0; i < oldMap.length; i++) {
            if (oldMap[i] == null) continue;
            for (Entry<K,V> entry : oldMap[i]) {
                put( entry.key,  entry.value);
            }

        }
    }
    public int size() {
        return this.size;
    }
}
