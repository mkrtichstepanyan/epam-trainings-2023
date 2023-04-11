package homework_17.Qnarik_Khachatryan.GenericLinkedList;

import java.util.Collection;


public class GenericLinkedList<T> {

    private Node<T> head;

    private int length;


    GenericLinkedList() {
        this.head = null;
    }


    public boolean add(T value) { // adding the specified element to the end of list
        Node<T> nodeToAdd = new Node<>(value); // Creating new node with given value
        if (this.head == null) { //if list is empty
            this.head = nodeToAdd;
        } else {  // If head is already exists
            Node<T> tempNode = head; // putting our head into temp var
            while (tempNode.nextNode != null) {   // while we have elements in our list
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = nodeToAdd; // adding new value to the end of our list
        }
        length++;
        return true;
    }

    public void add(int index, T value) {
        int positionToAdd = 0;
        int prevPosition = index - 1;
        Node<T> nodeToAdd = new Node<>(value);
        Node<T> currentNode = head;
        if (index > size()) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (index == 0) { // if we want to add the node to the head of our list
            head = nodeToAdd;
            head.nextNode = currentNode;
            length++;
        } else {
            while (currentNode.nextNode != null) {
                if (index == size()) {   // to the end
                    Node<T> lastNode = findLastNode();
                    lastNode.nextNode = nodeToAdd;
                    length++;
                    break;
                }
                if (prevPosition == positionToAdd) { // in the middle
                    Node<T> temp = currentNode.nextNode;
                    currentNode.nextNode = nodeToAdd;
                    nodeToAdd.nextNode = temp;
                    positionToAdd++;
                    length++;
                } else {
                    currentNode = currentNode.nextNode;
                    positionToAdd++;
                }
            }
        }
    }

    public boolean addAll(Collection<T> collection) {
        for (T element : collection) {
            add(element);
        }
        return false;
    }

    public void print() {
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {  //т.е. not empty
            System.out.print(currentNode.value + "-> ");
            currentNode = currentNode.nextNode;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        length = 0;
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.nextNode;
        }
        return length;
    }

    public int indexOf(T value) {
        int index = 0;
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return index;
            } else {
                currentNode = currentNode.nextNode;
                index++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        int index = 0;
        int lastIndex = -1; //if no such value
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                lastIndex = index;
            }
            currentNode = currentNode.nextNode;
            index++;
        }
        return lastIndex;
    }

    public T get(int index) {
        int currentIndex = 0;
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {
            if (index == currentIndex) {
                return currentNode.value;
            } else {
                currentNode = currentNode.nextNode;
                currentIndex++;
            }
        }
        return null;
    }

    public void set(int index, T value) {
        Node<T> nodeToChange = findNodeByIndex(index);
        nodeToChange.value = value;
    }

    public boolean contains(T value) {
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) {
                return true;
            } else {
                currentNode = currentNode.nextNode;
            }
        }
        return false;
    }

    public boolean remove(int index) {
        if (index > size()) { // if index is greater than size
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (index == 0) { // if we want to remove head node
            head = head.nextNode;
        } else { // if we want to remove from second node to last
            Node<T> nodeToRemove = findNodeByIndex(index);
            Node<T> prevNode = findPrevNodeByIndex(index);
            prevNode.nextNode = nodeToRemove.nextNode;
        }
        return false;
    }

    public void clear() {
        for (Node<T> first = head; first != null; ) {
            Node<T> next = first.nextNode;
            first.value = null;
            first.nextNode = null;
            first = next;
        }
        head = null;
    }


    // function-helpers
    public Node<T> findNodeByIndex(int index) {
        int currentIndex = 0;
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {
            if (index == currentIndex) {
                return currentNode;
            } else {
                currentNode = currentNode.nextNode;
                currentIndex++;
            }
        }
        return null;
    }

    public Node<T> findPrevNodeByIndex(int index) {
        int prevPosition = index - 1;
        int currentPosition = 0;
        Node<T> currentNode;
        currentNode = head;
        while (currentNode != null) {
            if (currentPosition == prevPosition) {
                return currentNode;
            } else {
                currentNode = currentNode.nextNode;
                currentPosition++;
            }
        }
        return null;

    }

    public Node<T> findLastNode() {
        Node<T> currentNode = head;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            if (currentNode.nextNode == null) {
                return currentNode;
            }
        }
        return null;
    }

}