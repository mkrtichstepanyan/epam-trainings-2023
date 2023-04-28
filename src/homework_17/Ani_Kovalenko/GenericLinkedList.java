package homework_17.Ani_Kovalenko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class GenericLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private Node<T> currentNode;
    private ArrayList<T> listToIterate;
    private int size = 0;
    private int position = 0;
    private boolean valueFound;


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
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
        return getNode(index).value;
    }

    public T set(int index, T newValue) {
        checkIndex(index);
        T oldValue;
        oldValue = get(index);
        getNode(index).value = newValue;
        return oldValue;
    }

    public int indexOf(T value) {
        listToIterate = iterator();
        for (int i = 0; i < size; i++) {
            position = findMatchingValue(value, listToIterate, i);
            if (valueFound) {
                return position;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        listToIterate = iterator();
        for (int i = size - 1; i > 0; i--) {
            position = findMatchingValue(value, listToIterate, i);
            if (valueFound) {
                return position;
            }
        }
        return -1;
    }

    public boolean contains(T value) {
        listToIterate = iterator();
        for (int i = 0; i < size; i++) {
            if (findMatchingValue(value, listToIterate, i) >= 0) {
                if (valueFound) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(T[] values) {
        for (T value : values) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<T> iterator() {
        listToIterate = new ArrayList<>();
        Node<T> nodeToIterate = head;
        listToIterate.add(nodeToIterate.value);
        while (hasNext(nodeToIterate)) {
            nodeToIterate = nodeToIterate.nextNode;
            listToIterate.add(nodeToIterate.value);
        }
        return listToIterate;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        listToIterate = iterator();
        for (int i = 0; i < array.length; i++) {
            array[i] = listToIterate.get(i);
        }
        return array;
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

    public void add(int index, T value) {
        checkIndex(index);
        notNull(value);
        Node<T> nodeOnTheIndex = getNode(index);
        Node<T> nodeToAdd;
        if (index == 0) {
            nodeToAdd = new Node<>(null, value, head);
            head = nodeToAdd;
            size++;
        } else {
            nodeToAdd = new Node<>(nodeOnTheIndex.previousNode, value, nodeOnTheIndex);
            nodeOnTheIndex.previousNode.nextNode = nodeToAdd;
            nodeOnTheIndex.previousNode = nodeToAdd;
            size++;
        }
    }

    public boolean addAll(T[] values) {
        if (values.length == 0) {
            return false;
        }
        for (T value : values) {
            notNull(value);
            add(value);
        }
        return true;
    }

    public boolean addAll(int index, T[] values) {
        if (values.length == 0) {
            return false;
        }
        checkIndex(index);
        for (T value : values) {
            notNull(value);
            add(index, value);
        }
        return true;
    }

    public boolean remove(T removeValue) {
        listToIterate = iterator();
        for (int i = 0; i < size; i++) {
            position = findMatchingValue(removeValue, listToIterate, i);
            if (valueFound) {
                remove(position);
                return true;
            }
        }
        return false;
    }

    public T remove(int index) {
        checkIndex(index);
        Node<T> nodeToRemove = getNode(index);
        T removedValue = nodeToRemove.value;
        if (position == 0) {
            if (head.nextNode != null) {
                head = head.nextNode;
            }
        } else if (position == size) {
            Node<T> tailNode = getNode(size);
            tail = tailNode.previousNode;
            tailNode = null;
        } else {
            nodeToRemove = getNode(position);
            nodeToRemove.previousNode.nextNode = nodeToRemove.nextNode;
        }
        size--;
        return removedValue;
    }

    public boolean removeAll(T[] values) {
        if (containsAll(values)) {
            for (T value : values) {
                position = indexOf(value);
                remove(position);
            }
            return true;
        }
        return false;
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

    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }

    public ListIterator listIterator() {
        // not implement
        return null;
    }

    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    public ListIterator listIterator(int index) {
        // not implement
        return null;
    }

    private void notNull(T value) {
        if (value == null) {
            throw new NullPointerException("The input value must not be null");
        }
    }

    private boolean hasNext(Node<T> nodeToIterate) {
        return nodeToIterate.nextNode != null;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
    }

    private int findMatchingValue(T value, ArrayList<T> iterator, int i) {
        valueFound = false;
        if (value instanceof Number) {
            if (iterator.get(i) == value) {
                valueFound = true;
                return i;
            }
        } else if (value instanceof String) {
            if (iterator.get(i).equals(value)) {
                valueFound = true;
                return i;
            }
        } else if (value instanceof Comparable<?> && iterator.get(i) instanceof Comparable<?>) {
            Comparable<T> comparable1 = (Comparable<T>) iterator.get(i);
            if ((comparable1.compareTo(value)) == 0) {
                valueFound = true;
                return i;
            }
        }
        return -1;
    }

    private Node<T> getNode(int index) {
        Node<T> nodeToIterate;
        int halfSize = size / 2;
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


    private class Node<T> {
        private T value;
        private Node<T> previousNode;
        private Node<T> nextNode;


        Node(Node previousNode, T value, Node nextNode) {
            this.previousNode = previousNode;
            this.value = value;
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    " previous value=" + previousNode.value +
                    ", value=" + value +
                    ", next value=" + nextNode.value +
                    '}';
        }
    }
}
