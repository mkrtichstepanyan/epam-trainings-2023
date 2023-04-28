package homework_18.anna_manukyan;

import java.util.Map;

public class Node<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;
    private Node<K, V> next;

    public Node(K key, V value, Node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }


    public void setKey(K key) {
        this.key = key;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setElement(Node<K, V> element) {
        this.next = element;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        this.value = value;
        return value;
    }


}
