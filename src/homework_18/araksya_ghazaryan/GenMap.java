package homework_18.araksya_ghazaryan;

public class GenMap<K, V> {
    private int size;
    private Node<K, V>[] genMap;

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
        if (genMap[index] == null) {
            genMap[index] = newNode;
        } else {
            Node<K, V> prevNode = null;
            Node<K, V> currentNode = genMap[index];
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
}