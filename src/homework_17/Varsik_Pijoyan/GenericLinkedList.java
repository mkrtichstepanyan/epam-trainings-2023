package homework_17.Varsik_Pijoyan;

import java.util.Collection;
import java.util.Comparator;

public class GenericLinkedList<G> implements Cloneable {
    private Node<G> head;
    private int size;

    public GenericLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    //Method, that clears the list
    public void clear() {
        head = null;
        size = 0;
    }

    //Method, that checks, if the list is empty, or not
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    //Method, that allows to add data at the first index
    public void addFirst(G data) {
        Node<G> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
    }

    //Method, that allows to add data at the last index
    public void addLast(G data) {
        Node<G> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<G> currentNode = head;
        while (null != currentNode.getNext()) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    //Method, to add a data at the given index
    public void add(int index, G data) {
        Node<G> node = new Node<>(data);
        if (index == 1) {
            node.setNext(head);
            head = node;
        } else {
            Node<G> previous = head;
            int count = 1;

            while (count < index - 1) {
                previous = previous.getNext();
                count++;
            }

            Node<G> current = previous.getNext();
            previous.setNext(node);
            node.setNext(current);
        }
    }

    //Method to add data
    public void add(G data) {
        Node<G> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<G> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    //Method to add new list elements to the previous list
    public void addAll(Collection<? extends G> collection) {
        for (G item : collection) {
            add(item);
        }
    }

    //Method, that allows to remove data from the first index
    public Node<G> removeFirst() {
        if (head == null) {
            return null;
        }
        Node<G> temp = head;
        head = head.getNext();
        temp.setNext(null);
        return temp;
    }

    //Method, that allows to remove data from the last index
    public Node<G> removeLast() {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node<G> current = head;
        Node<G> previous = null;

        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
        return previous;
    }

    //Method to remove given data
    public void remove(G data) {
        if (head == null) {
            return;
        }
        if (head.getData() == data) {
            head = head.getNext();
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    //Method, to find the index from the list
    public G get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
        return getNode(index).getData();

    }

    private Node<G> getNode(int index) {
        Node<G> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    //Method, to replace datas in the given index
    public G set(G data, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
        Node<G> newNode = getNode(index);
        G oldData = newNode.getData();
        newNode.setData(data);
        return oldData;
    }

    //Method to sort [A-Z]
    public void sort() {
        sort((Comparator<G>) Comparator.naturalOrder());
    }

    //Method to sort [Z-A]
    public void reversed() {
        sort((Comparator<G>) Comparator.naturalOrder().reversed());
    }

    //Method to sort list
    public void sort(Comparator<G> comparator) {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node<G> current = head;
        Node<G> sortedHead = null;
        while (current != null) {
            Node<G> next = current.getNext();
            sortedHead = insert(sortedHead, current, comparator);
            current = next;
        }
        head = sortedHead;
    }

    //Method that inserts a given node into a sorted list
    private Node<G> insert(Node<G> head, Node<G> node, Comparator<G> comparator) {
        if (head == null || comparator.compare(node.getData(), head.getData()) < 0) {
            node.setNext(head);
            return node;
        } else {
            head.setNext(insert(head.getNext(), node, comparator));
            return head;
        }
    }

    //Method to check if the given data contains in the list or not
    public boolean contains(G data) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == data) {
                System.out.println("'" + data + "' " + "data" + " contains in the list");
                return true;
            }
            current = current.getNext();
        }
        System.out.println("'" + data + "' " + "data" + " does not contains in the list");
        return false;
    }

    public int indexOf(G element) {
        Node<G> current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(element)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    //Method to clone list by using shallow copy
    public GenericLinkedList<G> clone() throws CloneNotSupportedException {
        GenericLinkedList<G> toClone = new GenericLinkedList<>();
        toClone.head = head;
        return toClone;
    }

    //Method to display datas
    public void display() {
        Node<G> current = head;
        while (current != null) {
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
