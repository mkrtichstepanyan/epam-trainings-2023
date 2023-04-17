package homework_17.yeghia_ansuryan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericLinkedList<T> {

    private int size = 0;
    private int location = 0;
    private Node<T> head;
    private Node<T> tail;
    private Node<T> currentNode;
    private boolean elementFound;
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
        notNull(inputValue);
        if (head == null) {
            currentNode = new Node<>(null, inputValue, null);
            head = tail = currentNode;
            size++;
            return true;
        }
        head = new Node<>(null, inputValue, head);
        head.nextNode.previousNode = head;
        size++;
        return true;
    }

    public void add(int index, T element) {
        checkIndex(index);
        notNull(element);
        Node<T> nodeOnTheIndex = getNode(index);
        Node<T> nodeToAdd;
        if (index == 0) {
            nodeToAdd = new Node<>(null, element, head);
            head = nodeToAdd;
            size++;
        } else {
            nodeToAdd = new Node<>(nodeOnTheIndex.previousNode, element, nodeOnTheIndex);
            nodeOnTheIndex.previousNode.nextNode = nodeToAdd;
            nodeOnTheIndex.previousNode = nodeToAdd;
            size++;
        }
    }

    public boolean addAll(T[] elements) {
        if(elements.length == 0){
            return false;
        }
        for (T element : elements) {
            notNull(element);
            add(element);
        }
        return true;
    }

    public boolean addAll(int index, T[] elements) {
        checkIndex(index);
        if(elements.length== 0){
            return false;
        }
        for (T element : elements) {
            notNull(element);
            add(index, element);
        }
        return true;
    }

    public ArrayList<T> iterator() {
        listToIterate = new ArrayList<>();
        Node<T> nodeToIterate = head;
        listToIterate.add(nodeToIterate.element);
        while (hasNext(nodeToIterate)) {
            nodeToIterate = nodeToIterate.nextNode;
            listToIterate.add(nodeToIterate.element);
        }
        return listToIterate;
    }

    public boolean contains(T element) {
        listToIterate = iterator();
        for (int i = 0; i < size; i++) {
            findMachiningValue(element, listToIterate, i);
            if (elementFound) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T[] elements) {
        for (T element : elements) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
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
                if (elementFound) {
                    remove(location);
                    return true;
                }
            }
        }
        return false;
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

    public boolean removeAll(T[] elements) {
        if (containsAll(elements)) {
            for (T element : elements) {
                location = indexOf(element);
                remove(location);
            }
            return true;
        }
        return false;
    }

    public void clear() {
        size = size - 1;
        do {
            getNode(size).previousNode = null;
            getNode(size).nextNode = null;
            size--;
        } while (size > 0);
    }

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


    public int indexOf(T element) {
        listToIterate = iterator();
        for (int i = 0; i < size; i++) {
            location = findMachiningValue(element, listToIterate, i);
            if (elementFound) {
                return location;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        listToIterate = iterator();
        for (int i = size-1; i > 0; i--) {
            location = findMachiningValue(element, listToIterate, i);
            if (elementFound) {
                return location;
            }
        }
        return -1;
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

    private void notNull(T element) {
        if (element == null) {
            throw new NullPointerException("The input value must not be null");
        }
    }

    private boolean hasNext(Node<T> nodeToIterate) {
        return nodeToIterate.nextNode != null;
    }

    private int findMachiningValue(T element, ArrayList<T> iterator, int i) {
        elementFound = false;
        if (element instanceof Number) {
            if (iterator.get(i) == element) {
                elementFound = true;
                return i;
            }
        } else if (element instanceof String) {
            if (iterator.get(i).equals(element)) {
                elementFound = true;
                return i;
            }
        } else if (element instanceof Comparable<?> && iterator.get(i) instanceof Comparable<?>) {
            Comparable<T> comparable1 = (Comparable<T>) iterator.get(i);
            if ((comparable1.compareTo(element)) == 0) {
                elementFound = true;
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

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
    }
}
