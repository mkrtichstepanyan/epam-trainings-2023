package homework_18.anna_manukyan;


import java.util.Collection;
import java.util.HashSet;
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
    private static final double LOAD_FACTOR = 0.75D;
    private static final int DEFAULT_CAPACITY = 16;


    public GenericMap() {
        this.buckets = new Node[DEFAULT_CAPACITY];
    }

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
        if (key != null) {
            if (size > 0) {
                for (int i = 0; i < buckets.length; i++) {
                    Node<K, V> current = buckets[i];
                    while (current != null) {
                        if (current.getKey().equals(key)) {
                            return true;
                        }
                        current = current.getNext();
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
    public boolean containsValue(Object value) {
        if (value != null) {
            if (size > 0) {
                for (int i = 0; i < buckets.length; i++) {
                    Node<K, V> current = buckets[i];
                    while (current != null) {
                        if (current.getValue().equals(value)) {
                            return true;
                        }
                        current = current.getNext();
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
        int index = getIndex(key);
        Node<K, V> bucket = buckets[index];
        while (bucket != null) {
            if (bucket.getKey().equals(key)) {
                return bucket.getValue();
            }
            bucket = bucket.getNext();
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];
        if (current != null) {
            if (current.getKey().equals(key)) {
                current.setValue(value);
                return current.getValue();
            }
            Node<K, V> next = current.getNext();
            next = current;

        }
        Node<K, V> newNode = new Node<>(key, value, current);
        buckets[index] = newNode;
        size++;
        extend();
        return value;
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
        for (Node<K, V> bucket : buckets) {
            while (bucket != null){
                bucket.setValue(null);
                bucket.setElement(null);
                bucket.setKey(null);
            }
            bucket=null;
        }
        buckets=null;
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet = new HashSet<>();
//        for (Node<K, V> bucket : buckets) {
//            bucket.getNext().
//        }
        return keySet;
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

//    private void checkIndex(int index) {
//        if (index < 0 || index > buckets.length - 1) {
//            throw new IndexOutOfBoundsException("Wrong index");
//        }
//    }

    private void extend() {
        if ((double) (size / buckets.length) >= LOAD_FACTOR) {
            int newCap = 2 * buckets.length;
            Node<K, V>[] newMap = new Node[newCap];
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] != null) {
                    int newIndex = getIndex(buckets[i]);
                    Node<K, V> next = buckets[i].getNext();
                    next = newMap[newIndex];
                    newMap[newIndex] = buckets[i];

                }
            }
            buckets = newMap;
        }
    }

    public void print() {
        for (Node<K, V> bucket : buckets) {
            while (bucket != null) {
                System.out.print("For " + bucket.getKey() + " key value is " + bucket.getValue());
                System.out.print("\n");
                bucket = bucket.getNext();
            }
        }
    }

}
