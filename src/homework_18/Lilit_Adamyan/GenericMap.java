package homework_18.Lilit_Adamyan;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {
    public static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] buckets;
    private int size;

    public GenericMap() {
        buckets = new Entry[DEFAULT_CAPACITY];
    }

    public void put(K key, V value) {
        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V> bucket = buckets[bucketIndex];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                bucket.value = value;
                return;
            }
            bucket = bucket.next;
        }
        bucket = new Entry<>(key, value);
        bucket.next = buckets[bucketIndex];
        if (buckets[bucketIndex] != null) {
            buckets[bucketIndex].previous = bucket;
        }
        buckets[bucketIndex] = bucket;
        size++;
    }

    public V get(K key) {
        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V> bucket = buckets[bucketIndex];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;

    }
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        Entry<K, V> previous;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }



}
