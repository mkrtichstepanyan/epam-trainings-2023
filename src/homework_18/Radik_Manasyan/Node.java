package homework_18.Radik_Manasyan;

public class Node <K,  V>{
    private K key;
    private V value;
    protected Node<K, V> next;

    Node(){}

    public void setValue(V value) {
        this.value = value;
    }

    public Node(K key, V value, Node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }
}
