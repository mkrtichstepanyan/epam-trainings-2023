package homework_18.Eduard_Eghiazaryan;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Node<K, V>[] li;
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

        // check if the size of the hash table is less than the
        // total number of key-value pairs in all maps
        int totalSize = size;
        for (int i = 0; i < li.length; i++) {
            Node<K, V> node = li[i];
            while (node != null) {
                totalSize++;
                node = node.getNext();
            }
        }
        if (totalSize > li.length) {
            Node<K, V>[] newLi = new Node[li.length * 2];
            GenericMap<K, V> newMap = new GenericMap<>();
            newMap.li = newLi;

            newMap.extend(this);

            this.li = newLi;
            this.size = newMap.size;
        }
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

    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for (int i = 0; i < li.length; i++) {
            Node<K, V> node = li[i];
            while (node != null) {
                values.add(node.getValue());
                node = node.getNext();
            }
        }
        return values;
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
