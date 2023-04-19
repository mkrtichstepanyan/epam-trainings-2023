package homework_18.Lilit_Adamyan;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {
    private List<List<Entry<K, V>>> buckets;
    private int size;

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public GenericMap(int defaultBucketCount) {
        buckets = new ArrayList<>(defaultBucketCount);
        for (int i = 0; i < defaultBucketCount; i++) {
            buckets.add(new LinkedList<>());
        }
        size = 0;
    }

    public void put(K key, V value) {
        int bucketIndex = key.hashCode() % buckets.size();
        List<Entry<K, V>> bucket = buckets.get(bucketIndex);
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int bucketIndex = key.hashCode() % buckets.size();
        List<Entry<K, V>> bucket = buckets.get(bucketIndex);
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;

    }


}
