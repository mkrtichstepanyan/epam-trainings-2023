package homework_18.melo_tutkhalyan;

import java.util.Map;

public class GenericMap<K, V> {

    private int size;
    private Node<K, V>[] table;

    @SuppressWarnings("unchecked")
    public GenericMap() {
        this.table = new Node[16];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public V get(K key) {
        int index = indexOfTable(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.getKey().equals(key)) {
                    return node.getValue();
                }
            }
        }
        return null;
    }

    public V put(K key, V value) {
        int index = indexOfTable(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.getKey().equals(key)) {
                    V oldValue = node.getValue();
                    node.setValue(value);
                    return oldValue;
                }
            }
        }
        this.table[index] = new Node<>(key, value, head);
        this.size++;
        this.extend();
        return value;
    }

    public void extend() {
        if (this.size > this.table.length && (this.table.length < (1 << 30))) {
            this.size = 0;
            Node<K, V>[] oldTable = this.table;
            this.table = new Node[this.table.length * 2];
            for (Node<K, V> head : oldTable) {
                if (head != null) {
                }
                for (Node<K, V> node = head; node != null; node = node.next) {
                    this.put(node.getKey(), node.getValue());
                }
            }
        }
    }

    private int indexOfTable(K key) {
        int hashCode = key.hashCode();
        return hashCode % this.table.length;
    }

}
