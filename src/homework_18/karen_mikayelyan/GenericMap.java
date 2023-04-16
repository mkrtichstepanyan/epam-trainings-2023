package homework_18.karen_mikayelyan;


import org.jetbrains.annotations.NotNull;

import java.util.*;


public class GenericMap<K, V> implements Map<K, V> {
    private int size;
    private Node<K, V>[] mapTable;

    public GenericMap() {
        this.mapTable = new Node[16];
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
        int index = this.indexOf(key);
        Node<K, V> head = this.mapTable[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.key.equals((key))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node<K, V> head : mapTable) {
            if (head != null) {
                if (value == null) {
                    for (Node<K, V> node = head; node != null; node = node.next) {
                        if (node.value == null) {
                            return true;
                        }
                    }
                } else {
                    for (Node<K, V> node = head; node != null; node = node.next) {
                        if (node.value.equals((value))) {
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
        int index = this.indexOf(key);
        Node<K, V> head = this.mapTable[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.key.equals((key))) {
                    return node.value;
                }
            }
        }
        return null;
    }


    public V put(K key, V value) {
        int index = this.indexOf(key);
        Node<K, V> head = this.mapTable[index];
        if (head != null) {
            for (Node<K, V> node = head; node != null; node = node.next) {
                if (node.key.equals((key))) {
                    V oldValue = node.value;
                    node.value = value;
                    return oldValue;
                }
            }
        }
        this.mapTable[index] = new Node<>(key, value, head);
        this.size++;
        this.extend();
        return value;
    }

    private void extend() {
        if (this.size > this.mapTable.length && (this.mapTable.length < (1 << 30))) {
            this.size = 0;
            Node<K, V>[] oldTable = this.mapTable;
            this.mapTable = new Node[this.mapTable.length * 2];
            for (Node<K, V> head : oldTable) {
                if (head != null) {
                }
                for (Node<K, V> node = head; node != null; node = node.next) {
                    this.put(node.key, node.value);
                }
            }
        }
    }

    @Override
    public V remove(Object key) {
        int index = this.indexOf(key);
        Node<K, V> head = this.mapTable[index];
        if (head != null) {
            for (Node<K, V> node = head, prev = null; node != null; prev = node, node = node.next) {
                if (node.key.equals((key))) {
                    V oldValue = node.value;
                    if (prev == null) {
                        this.mapTable[index] = node.next;
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

    public void clear() {
        for (int i = 0; i < this.mapTable.length; i++) {
            this.mapTable[i] = null;
        }
        this.size = 0;
    }

    @Override
    public void putAll(@NotNull Map<? extends K, ? extends V> m) {

    }

    public List<K> keys() {
        List<K> keys = new ArrayList<>(this.size);
        for (Node<K, V> head : mapTable) {
            if (head != null) {
                for (Node<K, V> node = head; node != null; node = node.next) {
                    keys.add(node.key);
                }
            }
        }
        return keys;
    }


    @Override
    public Set<K> keySet() {
        return null;
    }


    @Override
    public Collection<V> values() {
        Collection<V> values = new ArrayList<>(this.size);
        for (Node<K, V> head : mapTable) {
            if (head != null) {
                for (Node<K, V> node = head; node != null; node = node.next) {
                    values.add(node.value);
                }
            }
        }

        return values;
    }


    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private int indexOf(Object key) {
        return key.hashCode() & (this.mapTable.length - 1);
    }


    private static class Node<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node() {

        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public V setValue(V value) {
            return this.value = value;
        }
    }

}
