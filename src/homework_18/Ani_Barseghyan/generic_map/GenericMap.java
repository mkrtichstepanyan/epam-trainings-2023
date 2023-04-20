package homework_18.Ani_Barseghyan.generic_map;

public class GenericMap<K, V> {
    private int size;
    private Node<K, V>[] genericMap;

    public GenericMap() {
        this.genericMap = new Node[16];
    }

    GenericMap(int capacity) {
        this.genericMap = new Node[capacity];

    }

    public int size() {
        return this.size;
    }

    public V get(K key) {
        V value = null;
        int index = this.indexOf(key);
        Node<K, V> head = this.genericMap[index];
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
        if (genericMap[index] == null) {
            genericMap[index] = newNode;
        } else {
            Node<K, V> prevNode = null;
            Node<K, V> currentNode = genericMap[index];
            while (currentNode != null) {
                if (currentNode.getValue().equals(value)) {
                    currentNode.setValue(value);
                    break;
                }
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (prevNode != null) {
                prevNode.setNext(newNode);
            }
        }
    }

    public int indexOf(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % this.genericMap.length - 1);
    }
}
