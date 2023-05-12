package homework_18.Anush_Ananyan.GenericMap;

/*
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {
    private final int DEFAULT_CAPACITY = 16;
    private Entry[] buckets;
    private int size;


    public GenericMap() {
        buckets = new Entry[DEFAULT_CAPACITY];
    }

    public void put(K key, V value) {
        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V>  newBucket = buckets[bucketIndex];
        while (newBucket != null) {
            if (newBucket.getKey().equals(key)) {
                newBucket.setValue(value);
                return;
            }
            newBucket = newBucket.next;
        }
        newBucket = new Entry<>(key, value);
        newBucket.next = buckets[bucketIndex];
        if (buckets[bucketIndex] != null){
            buckets[bucketIndex].previous = newBucket;
        }
        buckets[bucketIndex] = newBucket;
        size++;
    }

    public V get(K key) {
        int bucketIndex = key.hashCode() % buckets.length;
        Entry<K, V> bucket =  buckets[bucketIndex];
        while (bucket != null) {
            if (bucket.getKey().equals(key)) {
                return bucket.getValue();
            }
            bucket = bucket.next;
        }
        return null;
    }
}
