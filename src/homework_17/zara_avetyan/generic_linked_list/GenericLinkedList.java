package homework_17.zara_avetyan.generic_linked_list;

import java.util.Iterator;

public class GenericLinkedList<G> {

    private Node head;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(G data) {
        if (head == null) return false;
        Node nextNode = head;
        int i = 0;
        do {
            if (nextNode.getData() == data) return true;
            nextNode = nextNode.getNext();
            i++;
        } while (nextNode.getData() != null && i != size);
        return false;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            arr[i] = node.getData();
            node = node.getNext();
        }
        return arr;
    }

    public void add(Object o) {
        Node newHead = new Node(o);
        newHead.setNext(head);
        head = newHead;
        size++;
    }

    public void remove(G o) {
        Node currentHead = head;
        Node tail = null;
        int count = 0;
        while (currentHead.getData() != o) {
            if (count == size) return;
            tail = currentHead;
            currentHead = currentHead.getNext();
            count++;
        }
        tail.setNext(currentHead.getNext());
        size--;
    }

    public void addAll(GenericLinkedList<G> list) {
        for (int i = list.size - 1; i >= 0; i--) {
            add(list.get(i).getData());
        }
    }

    public void addAll(int index, GenericLinkedList list) {
        if (size + 1 < index || index < 0) return;
        Node node = this.get(index - 1);
        Node nextNode = this.get(index);
        node.setNext(list.head);
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(nextNode);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public Node get(int index) {
        if (index < 0 || index > size) return null;
        int currentIndex = 0;
        Node currentHead = head;
        while (currentHead != null && currentIndex!=index) {
            currentHead = currentHead.getNext();
            currentIndex++;
        }
        return currentHead;
    }

    public void set(int index, G data) {
        if (index > size || index < 0) return;
        Node node = this.get(index);
        node.setData(data);
    }

    public void add(int index, G data) {
        if (index > size + 1 || index < 0) return;
        if (index == 0) {
            this.add(data);
            return;
        }
        Node node = this.get(index - 1);
        Node nextNode = node.getNext();
        node.setNext(new Node<>(data));
        node.getNext().setNext(nextNode);
        size++;
    }

    public void remove(int index) {
        if (index > size || size < 0) return;
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        Node node = this.get(index - 1);
        node.setNext(node.getNext().getNext());
        size--;
    }

    public int indexOf(Node o) {
        int index = 0;
        Node node = head;
        while (index < size) {
            if (o == node) return index;
            index++;
            node = node.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Node o) {
        if (indexOf(o) == -1) return -1;
        return size - indexOf(o) - 1;
    }

    public GenericLinkedList<G> subList(int fromIndex, int toIndex) {
        GenericLinkedList<G> newGenericLinkedList = new GenericLinkedList<G>();
        Node newHead;
        if (fromIndex < 0 || fromIndex > size || toIndex < 1 || toIndex > size || (toIndex - fromIndex) < 0)
            return null;
        for (int i = toIndex - 1; i > fromIndex - 1; i--) {
            newHead = get(i);
            newGenericLinkedList.add(newHead.getData());
        }
        return newGenericLinkedList;
    }

    public void removeAll(GenericLinkedList list) {
        Node node = list.head;
        while (node != null) {
            remove((G) node.getData());
            node = node.getNext();
        }
    }

    public boolean containsAll(GenericLinkedList list) {
        Node node = list.head;
        while (node != null) {
            if (!contains((G) node.getData())) return false;
            node = node.getNext();
        }
        return true;
    }

    public Iterator<G> iterator() {
        return new Iterator<G>() {
            private Node<G> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public G next() {
                G value = node.getData();
                node = node.getNext();
                return value;
            }
        };
    }

    public void display() {
        String s = "";
        Node newHead = head;
        while (newHead != null) {
            s += newHead.getData() + " ";
            newHead = newHead.getNext();
        }
        System.out.println(s);
    }
}
