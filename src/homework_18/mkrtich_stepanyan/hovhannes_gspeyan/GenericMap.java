package homework_18.mkrtich_stepanyan.hovhannes_gspeyan;

import java.util.*;

public class GenericMap<K, V> implements Map<K, V> {
    private Node<K, V>[] table;
    private int size;

    public GenericMap() {
        this.table = new Node[16];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int index = this.indexFor(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node<K, V> head : table) {
            if (head != null) {
                if (value == null) {
                    for (Node<K, V> node = head; node != null; node = node.next) {
                        if (node.value == null) {
                            return true;
                        }
                    }
                } else {
                    for (Node<K, V> node = head; node != null; node = node.next) {
                        if (node.value.equals(value)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int index = this.indexFor(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int index = this.indexFor(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    V oldValue = node.value;
                    node.value = value;
                    return oldValue;
                }
            }
        }
        this.table[index] = new Node<>(key, value, head);
        this.size++;
        this.extend();
        return value;
    }

    @Override
    public V remove(Object key) {
        int index = this.indexFor(key);
        Node<K, V> head = this.table[index];
        if (head != null) {
            for (Node<K, V> node = head, prev = null; node != null; prev = node, node = node.next) {
                if (node.key.equals(key)) {
                    V oldValue = node.value;
                    if (prev == null) {
                        this.table[index] = node.next;
                    } else {
                        prev.next = node.next;
                    }
                    this.size--;
                    return oldValue;
                }
            }
        }
        return null;
    }

    public List<K> keys() {
        List<K> keys = new ArrayList<>(this.size);
        for (Node<K, V> head : table) {
            if (head != null) {
                for (Node<K, V> node = head; node != null; node = node.next) {
                    keys.add(node.key);
                }
            }
        }
        return keys;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.table.length; i++) {
            this.table[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Collection<V> values() {
        Collection<V> values = new ArrayList<>(this.size);
        for (Node<K, V> head : table) {
            if (head != null) {
                for (Node<K, V> node = head; node != null; node = node.next) {
                    values.add(node.value);
                }
            }
        }
        return values;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private void extend() {
        if (this.size > this.table.length && (this.table.length < (1 << 30))) {
            this.size = 0;
            Node<K, V>[] oldTable = this.table;
            this.table = new Node[this.table.length * 2];
            for (Node<K, V> head : oldTable) {
                if (head != null) {
                    for (Node<K, V> node = head; node != null; node = node.next) {
                        this.put(node.key, node.value);
                    }
                }
            }
        }
    }

    private int indexFor(Object key) {
        return key.hashCode() & (this.table.length - 1);
    }

    private static class Node<K, V> implements Map.Entry<K, V> {

        private K key;
        private V value;

        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node() {
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            return this.value = value;
        }
    }
}
