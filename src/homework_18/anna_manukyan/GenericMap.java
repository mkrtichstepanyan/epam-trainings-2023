package homework_18.anna_manukyan;


import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> implements Map<K, V> {

    private Node<K, V>[] buckets;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        if (value != null) {
            if (size > 0) {
                for (Node<K, V> bucket : buckets) {
                    if (bucket.getValue().equals(value)) {
                        return true;
                    }
                }
            } else {
                System.out.println("Map did not contain any element.");
                System.exit(1);
            }
        } else {
            throw new NullPointerException("Value can not be null!");
        }
        return false;
    }

    @Override
    public V get(Object key) {
        for (Node<K, V> bucket : buckets) {
            if (bucket.getKey().equals(key)) {
                return bucket.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
         return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private int getIndex(Object key) {
        int index = key.hashCode();
        return index % buckets.length;
    }

    private void checkIndex (int index) {
        if (index<0 || index > buckets.length-1) {
            throw  new IndexOutOfBoundsException("Wrong index");
        }
    }
}
