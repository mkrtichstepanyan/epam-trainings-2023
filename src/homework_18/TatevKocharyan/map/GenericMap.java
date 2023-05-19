package homework_18.TatevKocharyan.map;

import java.util.Arrays;

public class GenericMap<T, E> {

    private Node<T, E>[] buckets;
    private static int size = 16;


    public GenericMap() {
        buckets = new Node[size];
    }


    public void put(T key, E value) {
        int number = 0;
        int hashCode = key.hashCode();
        String hashcodeCheck = String.valueOf(hashCode);
        char minus = '-';
        if (hashcodeCheck.charAt(0) == minus) {
            String substring = hashcodeCheck.substring(1);
            hashCode = Integer.parseInt(substring);
        }
        int bucketNumber = hashCode % size;
        Node<T, E> node = new Node<>();
        node.setKey(key);
        node.setValue(value);
        for (int i = 0; i < buckets.length; i++) {
            Node<T, E> head = buckets[bucketNumber];
            if (buckets[i] != null && bucketNumber == i) {
                head.setNext(node);
                node.setIndex(1);
                number++;

            }
            if (buckets[i] == null && bucketNumber == i) {
                node.setIndex(0);
                buckets[bucketNumber] = node;
                head = node;
            }


        }


    }


    public Node<T, E> get(T key) {
        int hashCode = key.hashCode();
        String hashcodeCheck = String.valueOf(hashCode);
        char minus = '-';
        if (hashcodeCheck.charAt(0) == minus) {
            String substring = hashcodeCheck.substring(1);
            hashCode = Integer.parseInt(substring);
        }
        Node<T, E> nodeToReturn = null;
        int bucketNumber = hashCode % size;
        for (int i = 0; i < buckets.length; i++) {
            if (bucketNumber == i) {
                Node<T, E> head = buckets[i];
                T key1 = buckets[i].getKey();
                if (key == key1) {
                    Node<T, E> bucket = buckets[i];
                    nodeToReturn = bucket;
                } else {
                    while (head.getKey() != key) {
                        head = head.next;
                    }
                    nodeToReturn = head;
                }
            }
        }
        return nodeToReturn;
    }

    @Override
    public String toString() {
        return "GenericMap{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
