package homework_18.Nona_Asatryan.genericMap;


/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {

    private Node<K, V>[] buckets;
    private int size;
    private static final double LOAD_FACTOR = 0.75D;

    public GenericMap() {
        this.buckets = new Node[16];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public V put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];
        while (head != null) {
            if (head.getKey().equals(key)) {
                V prevValue = head.getValue();
                head.setValue(value);
                return prevValue;
            }
            head = head.next;
        }
        buckets[index] = new Node<>(key, value, head);
        size++;
        extend();
        return value;
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];
        while (head != null) {
            if (head.getKey().equals(key)) {
                return head.getValue();
            }
            head = head.next;
        }
        return null;
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];
        while (head != null) {
            if (head.getKey().equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (Node<K, V> head : buckets) {
            while (head != null) {
                if (head.getValue().equals(value)) {
                    return true;
                }
                head = head.next;
            }
        }
        return false;
    }

    public V remove(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;
        while (head != null) {
            if (head.getKey().equals(key)) {
                V value = head.getValue();
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = null;
        }
        size = 0;
    }

    public void print() {
        for (Node<K, V> node : buckets) {
            while (node != null) {
                System.out.println(node.getKey() + " -> " + node.getValue());
                node = node.next;
            }
        }
    }

    private void extend() {
        if ((double) size / buckets.length >= LOAD_FACTOR) {
            int newCapacity = buckets.length * 2;
            Node<K, V>[] newBucket = new Node[newCapacity];

            for (int i = 0; i < buckets.length; i++) {
                Node<K, V> current = buckets[i];
                while (current != null) {
                    int newIndex = current.getKey().hashCode() % newCapacity;
                    Node<K, V> next = current.next;
                    current.next = newBucket[newIndex];
                    newBucket[newIndex] = current;
                    current = next;
                }
            }

            buckets = newBucket;
        }
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % buckets.length);
    }
}
