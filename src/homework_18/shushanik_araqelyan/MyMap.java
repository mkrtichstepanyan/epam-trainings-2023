package homework_18.shushanik_araqelyan;

import java.util.HashSet;
import java.util.Set;

public class MyMap <C, D>{
    private MyMap<C, D> map;

    private class Node {
        C key;
        D value;
        MyMap.Node next;

        public Node(C key, D value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    public MyMap() {
        head = null;
    }

    public void put(C key, D value) {
        if (head == null) {
            head = new MyMap.Node(key, value);
        } else {
            MyMap.Node curr = head;
            while (curr.next != null && !curr.key.equals(key)) {
                curr = curr.next;
            }
            if (curr.key.equals(key)) {
                curr.value = value;
            } else {
                curr.next = new MyMap.Node(key, value);
            }
        }
    }
    public C get(C key) {
        MyMap.Node curr = head;
        while (curr != null && !curr.key.equals(key)) {
            curr = curr.next;
        }
        if (curr != null) {
            return (C) curr.value;
        } else {
            return null;
        }
    }
    public Set<C> keySet() {
        Set<C> set = new HashSet<>();
       MyMap.Node curr = head;
        while (curr != null) {
            set.add((C) curr.value);
            curr = curr.next;
        }
        return set;
    }

}