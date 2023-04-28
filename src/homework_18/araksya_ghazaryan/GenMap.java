package homework_18.araksya_ghazaryan;

import java.util.Arrays;

public class GenMap<K, V> {
    private int size;
    private Node<K, V>[] genMap;
    private  int length;

    GenMap() {
        this.genMap = new Node[16];
    }

    public int size() {
        return this.size;
    }

    public V get(K key) {
        V value = null;
        int index = this.indexOf(key);
        Node<K, V> head = this.genMap[index];
        while (head != null) {
            if (head.getKey().equals(key)) {
                value = head.getValue();
                break;
            }
            head = head.next;
        }
        return value;
    }

    public void put(K key, V value) {
        int index = this.indexOf(key);
        Node newNode = new Node(key, value, null);
        Node<K, V> nodeFromArray = genMap[index];

        if (nodeFromArray == null) {
            genMap[index] = newNode;
            size = ++size;
        } else {
            boolean isValueChanged = nodeValueIsReplaced(key, value, nodeFromArray);
            if (!isValueChanged) {
                newNode.setNext(nodeFromArray);
                genMap[index] = newNode;
            }
        }
    }
    private boolean nodeValueIsReplaced(K key, V value, Node<K, V> nodeFromArray) {
        Node<K, V> temporaryNode = nodeFromArray;
        while (temporaryNode != null) {
            if (temporaryNode.getKey().equals(key)) {
                temporaryNode.setValue(value);
                return true;
            }
            temporaryNode = temporaryNode.getNext();
        }
        return false;
    }

    public int indexOf(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % this.genMap.length - 1);
    }
    public  class Node<K, V> {
        K key;
        V value;
        protected Node<K, V> next;

        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }

    @Override
    public String toString() {
        return "GenMap{" +
                "size=" + size +
                ", genMap=" + Arrays.toString(genMap) +
                '}';
    }
}