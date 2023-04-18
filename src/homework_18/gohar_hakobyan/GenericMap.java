package homework_18.gohar_hakobyan;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {
    private static final int CAPACITY = 16;
    private static Node[] buckets = new Node[CAPACITY];
    private static int size = 0;

    public GenericMap(Node[] buckets, int size) {
        this.buckets = buckets;
        this.size = size;
    }

    public GenericMap() {
        this(CAPACITY);
    }

    public GenericMap(int capacity) {
        this.buckets = new Node[capacity];
    }

    private static int getSize() {
        return buckets.length;
    }

    private static void extendCapacity() {
        int newSize = buckets.length * 2;
        if (newSize > buckets.length) {
            Entry[] newValues = new Node[newSize];
            System.arraycopy(buckets, 0, newValues, 0, buckets.length);
            buckets = (Node[]) newValues;
        }
    }

    static class Node<K, V> implements Entry<K, V> {
        private int HASH;
        private K KEY;
        private V value;
        private Node<K, V> next;


        public Node(int hash, K KEY, V value, Node<K, V> next) {
            this.HASH = hash;
            this.KEY = KEY;
            this.value = value;
            this.next = next;
        }

        public Node() {
        }

        public Node(K key, V value) {
            this.KEY = key;
            this.value = value;
        }


        @Override
        public Object get(K key) {
            if (key == null) {
                return null;
            }
            int bucket = getHASH(key) % getSize();
            if (bucket >= 0 && bucket < buckets.length) {
                Node existingNode = buckets[bucket];
                while (existingNode != null) {
                    if (existingNode.KEY.equals(key)) {
                        return existingNode.value;
                    }
                    existingNode = existingNode.next;
                }
            }
            return null;
        }


        @Override
        public void put(K key, V value) {
            Entry<K, V> entry = new Node<>(key, value);

            int bucket = getHASH(key) % getSize();
            if (bucket >= 0 && bucket < buckets.length) {
                Node<K, V> existing = buckets[bucket];
                if (existing == null) {
                    buckets[bucket] = (Node) entry;
                    size++;
                } else {
                    while (existing.next != null) {
                        if (existing.KEY.equals(key)) {
                            existing.value = value;
                            return;
                        }
                        existing = existing.next;
                    }
                    if (existing.KEY.equals(key)) {
                        existing.value = value;
                    } else {
                        existing.next = (Node<K, V>) entry;
                        size++;
                    }
                }
                if (size >= buckets.length) {
                    extendCapacity();
                }

            }
        }


        public K getKEY() {
            return KEY;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }


        private int getHASH(K key) {
            if (key == null) {
                return 0;
            }
            int hash = key.hashCode();
            return hash;
        }
    }
}


