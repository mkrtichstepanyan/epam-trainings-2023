package homework_18.Diana_Melkonyan;


import java.util.*;

import static java.util.Objects.hash;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {

    private int capacity;
    private int size;

    private Entry<K, V>[] table;

    public GenericMap() {
        capacity = 16;
        table = new Entry[capacity];
        size = 0;
    }

    public V put(K key, V value) {
        int index = key.hashCode() % capacity;
        Entry<K, V> head = table[index];
        if (head != null) {
            for (Entry<K, V> entry = head; entry != null; entry = entry.next) {
                if (head.key.equals(key)) {
                    V value1 = head.value;
                    head.value = value;
                    return value1;
                }
            }
        }
        table[index] = new Entry<>(key, value);
        size++;
        extend();
        return value;
    }

    private void extend() {
        if (size > capacity && (capacity < (1 << 30))) {
            size = 0;
            Entry<K, V>[] oldTable = table;
            table = new Entry[2 * capacity + 1];
            for (Entry<K, V> entry : oldTable) {
                if (entry != null) {}
                    for (Entry<K, V> e = entry; e != null; e = e.next) {
                        put(e.key, e.value);
                    }

            }
        }

    }


    public V get(K key) {
        int index = key.hashCode() % capacity;
        while (true) {
            if (table[index] == null) {
                return null;
            } else if (key.equals(table[index].key)) {
                return table[index].value;
            } else {
                index = (index + 1) % capacity;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(table);
    }

    class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return (String) value;
        }
    }
}



