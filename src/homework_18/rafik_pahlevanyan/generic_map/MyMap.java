package homework_18.rafik_pahlevanyan.generic_map;


import java.util.*;

public class MyMap<K, V> {
    private class Node {
        K key;
        V value;
        Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node head;

    public MyMap() {
        head = null;
    }

    public void put(K key, V value) {
        if (head == null) {
            head = new Node(key, value);
        } else {
            Node curr = head;
            while (curr.next != null && !curr.key.equals(key)) {
                curr = curr.next;
            }
            if (curr.key.equals(key)) {
                curr.value = value;
            } else {
                curr.next = new Node(key, value);
            }
        }
    }

    public V get(K key) {
        Node curr = head;
        while (curr != null && !curr.key.equals(key)) {
            curr = curr.next;
        }
        if (curr != null) {
            return curr.value;
        } else {
            return null;
        }
    }


    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        Node curr = head;
        while (curr != null) {
            set.add(curr.key);
            curr = curr.next;
        }
        return set;
    }

}

