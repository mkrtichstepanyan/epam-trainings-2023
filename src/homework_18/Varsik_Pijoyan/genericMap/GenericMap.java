package homework_18.Varsik_Pijoyan.genericMap;

public class GenericMap<K, V> {
    private Entry<K, V>[] table; //Array of entry
    private static int DEFAULT_CAPACITY = 16; //Initial capacity of Map
    private int size;


    public GenericMap() {
        table = new Entry[DEFAULT_CAPACITY];
    }

    public GenericMap(int capacity) {
        this.DEFAULT_CAPACITY = capacity;
        table = new Entry[capacity];
    }

    public Entry<K, V>[] getTable() {
        return table;
    }

    public void setTable(Entry<K, V>[] table) {
        this.table = table;
    }

    public void put(K key, V value) {

        if (key == null)
            return;    //does not allow to store null.

        //calculate hash of key.
        int hash = hash(key);
        //create new entry.
        Entry<K, V> newEntry = new Entry<>(key, value);

        //if table location does not contain any entry,we should store entry there.
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];

            while (current != null) { //here we have reached last entry of bucket.
                if (current.getKey().equals(key)) {
                    newEntry.setNext(current.getNext());
                    if (previous == null) {  //here node has to be inserted on first of bucket.
                        table[hash] = newEntry;
                    } else {
                        previous.setNext(newEntry);
                    }
                    return;
                }
                previous = current;
                current = current.getNext();
            }
            previous.setNext(newEntry);
            size++;
        }
        if (size / DEFAULT_CAPACITY > 0.75) {
            extendCapacity();
        }
    }

    private void extendCapacity() {
        DEFAULT_CAPACITY *= 2;
        Entry<K, V>[] oldTable = table;
        table = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
        size = 0;
        // rehash all key-value pairs
        for (Entry<K, V> node : oldTable) {
            while (node != null) {
                put(node.getKey(), node.getValue());
                node = node.getNext();
            }
        }
    }

    private int hash(K key) { //CALCULATING HASH OF KEY
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
    }

    public V get(K key) {
        V value = null;
        int hash = hash(key);
        Entry<K, V> entry = table[hash];

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }

            entry = entry.getNext();
        }
        return value;
    }


    public void display() {
        System.out.print("[");
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            if (table[i] != null) {
                Entry<K, V> entry = table[i];
                while (entry != null) {
                    System.out.print(entry.toString());
                    entry = entry.getNext();
                }
            }
        }
        System.out.print("]");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}