package homework_18.argishti_Mesropyan;


public class GenericMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private final Node<K, V>[] li;
    private int size;


    public GenericMap() {
        li = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public GenericMap(int capacity) {
        li = new Node[capacity];
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key, li.length);
        Node<K, V> temp = li[index];
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                temp.setValue(value);
                return;
            }
            temp = temp.getNext();
        }
        Node<K, V> newNode = new Node<>(key, value);
        newNode.setNext(li[index]);
        li[index] = newNode;
        size++;
    }


    public V get(K key) {
        int index = getIndex(key, li.length);
        Node<K, V> temp = li[index];
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp.getValue();
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void extend(GenericMap<K, V> otherMap) {
        for (Node<K, V> node : otherMap.li) {
            Node<K, V> temp = node;
            while (temp != null) {
                put(temp.getKey(), temp.getValue());
                temp = temp.getNext();
            }
        }
    }


    private int getIndex(K key, int size) {
        return Math.abs(key.hashCode() % size);
    }
}
