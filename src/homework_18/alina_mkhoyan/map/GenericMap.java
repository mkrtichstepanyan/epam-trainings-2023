package homework_18.alina_mkhoyan.map;


/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private int capacity;
    private int size;
    private List<Entry<K, V>>[] buckets;

    public GenericMap() {
        this(DEFAULT_CAPACITY);

    }

    public GenericMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new List[capacity];
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
        size++;
        if (size > capacity) {
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void resize() {
        capacity *= 2;
        List<Entry<K, V>>[] newBuckets = new List[capacity];
        for (List<Entry<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    int index = getIndex(entry.key);
                    if (newBuckets[index] == null) {
                        newBuckets[index] = new LinkedList<>();
                    }
                    newBuckets[index].add(entry);
                }
            }
        }
        buckets = newBuckets;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public List<K> keys() {
        List<K> key = new ArrayList<>(this.size);
        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Entry<K, V>> list = (LinkedList<Entry<K, V>>) buckets[i];
            if (list != null) {
                for (Entry<K, V> entry : list) {
                    key.add(entry.getKey());
                }
            }
        }
        return key;
    }


    public static class Entry<K, V> {
        public Entry<K, V> next;
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
