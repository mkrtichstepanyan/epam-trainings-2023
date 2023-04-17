package homework_17.yeghia_ansuryan;

import java.util.ArrayList;
import java.util.List;

public class GenericLinkedList<T> implements Comparable<T>, Cloneable {

    private int size = 0;
    private int location = 0;
    private int tailLocation;
    private Node<T> head;
    private Node<T> tail;
    private Node<T> localTail;
    private Node<T> localHead;
    private Node<T> currentNode;
    ArrayList<T> listToIterate;


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean add(T inputValue) {
        if (head == null) {
            currentNode = new Node<>(null, inputValue, null);
            head = tail = currentNode;
            size++;
            return true;
        }
        currentNode = new Node<>(null, inputValue, head);
        head = currentNode;
        updateTail();
        size++;
        return true;
    }

    public void add(int index, T element) {
        checkIndex(index);
        Node<T> nodeOnTheIndex = getNode(index);
        Node<T> nodeNeedAdd = new Node<>(nodeOnTheIndex.previousNode, element, nodeOnTheIndex);
    }

    public boolean addAll(T[] elements) {
        for (T value : elements) {
            add(value);
            return true;
        }
        return false;
    }

    public boolean addAll(int index, T[] elements) {
        Node<T> nodeOnTheIndex = getNode(index);
        makingLinkedList(elements);
        localTail.nextNode = nodeOnTheIndex;
        localHead.previousNode = nodeOnTheIndex.previousNode;
        return false;
    }

    public ArrayList<T> iterator() {
        listToIterate = new ArrayList<>();
        T nextElement;
        listToIterate.add(currentNode.element);
        if (hasNext()) {
            nextElement = currentNode.nextNode.element;
            listToIterate.add(nextElement);
        }
        return listToIterate;
    }

    public boolean contains(T element) {
        listToIterate = iterator();
        for (int i = 0; i < size; i++) {
            if (findMachiningValue(element, listToIterate, i) >= 0) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        listToIterate = iterator();
        for (int i = 0; i < array.length; i++) {
            array[i] = listToIterate.get(i);
        }
        return array;
    }

    public boolean remove(T removeElement) {
        if (contains(removeElement)) {
            listToIterate = iterator();
            for (int i = 0; i < size; i++) {
                location = findMachiningValue(removeElement, listToIterate, i);
            }
            remove(location);
            return true;
        }
        return false;
    }

//    @Override
//    public void clear() {
//
//    }

    public T get(int index) {
        checkIndex(index);
        return getNode(index).element;
    }

    public T set(int index, T newElement) {
        checkIndex(index);
        T oldElement;
        oldElement = get(index);
        getNode(index).element = newElement;
        return oldElement;
    }

    public T remove(int index) {
        checkIndex(index);
        Node<T> nodeToRemove = getNode(index);
        T removedElement = nodeToRemove.element;
        if (location == 0) {
            if (head.nextNode != null) {
                head = head.nextNode;
            }
        } else if (location == size) {
            Node<T> tailNode = getNode(size);
            tail = tailNode.previousNode;
            tailNode = null;
        } else {
            nodeToRemove = getNode(location);
            nodeToRemove.previousNode.nextNode = nodeToRemove.nextNode;
        }
        size--;
        return removedElement;
    }

    public int indexOf(T element) {
        listToIterate = iterator();
        for (int i = 0; i < size; i++) {
            location = findMachiningValue(element, listToIterate, i);
        }
        return location;
    }

    public int lastIndexOf(T element) {
        listToIterate = iterator();
        for (int i = size; i > 0; i--) {
            location = findMachiningValue(element, listToIterate, i);
        }
        return location;
    }

    public List subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        listToIterate = iterator();
        ArrayList<T> subList = new ArrayList<>();
        for (int i = fromIndex; i <= toIndex; i++) {
            subList.add(listToIterate.get(i));
        }
        return subList;
    }

//    public boolean removeAll(Collection c) {
//        return false;
//    }

    public boolean containsAll(T[] elements) {
        for (T element : elements) {
            if (contains(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        listToIterate = iterator();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(listToIterate.get(i)).append(" ");
        }
        stringBuilder.append("]");
        return String.valueOf(stringBuilder);
    }

    private void updateTail() {
        Node<T> tailNode = getNode(size);
        if (tailNode.nextNode == null) {
            tail = tailNode;
        }
    }

    private boolean hasNext() {
        return currentNode.nextNode != null;
    }

    private int findMachiningValue(T value, ArrayList<T> iterator, int i) {
        if (value instanceof Number) {
            if (iterator.get(i) == value) {
                return i;
            }
        } else if (value instanceof String) {
            if (iterator.get(i).equals(value)) {
                return i;
            }
        } else if (value instanceof Comparable<?> && iterator.get(i) instanceof Comparable<?>) {
            Comparable<T> comparable1 = (Comparable<T>) iterator.get(i);
            if ((comparable1.compareTo(value)) == 0) {
                return i;
            }
        }
        return -1;
    }

    private Node<T> getNode(int index) {
        int halfSize = size / 2;
        Node<T> nodeToIterate;
        if (index <= halfSize) {
            nodeToIterate = head;
            for (int i = 0; i < index; i++) {
                nodeToIterate = nodeToIterate.nextNode;
            }
        } else {
            nodeToIterate = tail;
            for (int i = size - 1; i > index; i--) {
                nodeToIterate = nodeToIterate.previousNode;
            }
        }
        return nodeToIterate;
    }

    private T getElement(int index) {
        checkIndex(index);
        return getNode(index).element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
    }

    private void makingLinkedList(T[] elements) {
        Node<T> newNode;
        int i = 0;
        do {
            if (i == 0) {
                newNode = new Node<>(null, elements[i], null);
                localHead = newNode;
            } else {
                newNode = new Node<>(null, elements[i], localHead);
                if (localHead.nextNode == null) {
                    localTail = localHead;
                }
                localHead = newNode;
            }
            i++;
        } while (i < elements.length);
    }
}
