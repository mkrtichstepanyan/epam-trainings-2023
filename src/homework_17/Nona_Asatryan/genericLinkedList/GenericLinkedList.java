package homework_17.Nona_Asatryan.genericLinkedList;

import java.util.*;

public class GenericLinkedList<E> implements Cloneable {

    private int size;
    private Node<E> firstElement;
    private Node<E> lastElement;

    public GenericLinkedList() {
        this.size = 0;
        this.firstElement = null;
        this.lastElement = null;
    }

    public GenericLinkedList(Node<E> firstElement, Node<E> lastElement) {
        this.firstElement = firstElement;
        this.lastElement = lastElement;
    }

    public int size () {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;    }


    public boolean contains(E element) {
        Node<E> currentNode = firstElement;
        while (currentNode != null) {
            if (element.equals(currentNode.element)) {
                return true;
            }
            currentNode = currentNode.nextElement;
        }
        return false;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> currentNode = firstElement;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public E next() {
                E element = currentNode.element;
                currentNode = currentNode.nextElement;
                return element;
            }
        };
    }

    public E[] toArray() {
        E[] array = (E[]) new Object[size];
        Node<E> currentNode = firstElement;
        int i = 0;
        while (currentNode != null) {
            array[i] = currentNode.element;
            currentNode = currentNode.nextElement;
            i++;
        }
        return array;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (firstElement == null) {
            firstElement = newNode;
            lastElement = newNode;
        } else {
            lastElement.nextElement = newNode;
            lastElement = newNode;
        }
        size++;
    }

    public boolean remove(E element) {
        Node<E> currentNode = firstElement;
        Node<E> previousNode = null;
        while (currentNode != null && !currentNode.element.equals(element)) {
            previousNode = currentNode;
            currentNode = currentNode.nextElement;
        }
        if (currentNode == null) {
            return false;
        }
        if (previousNode == null) {
            firstElement = currentNode.nextElement;
        } else {
            previousNode.nextElement = currentNode.nextElement;
        }
        if (currentNode == lastElement) {
            lastElement = previousNode;
        }
        size--;
        return true;
    }

    public void addAll(E[] array) {
        for (E element : array) {
            add(element);
        }
    }

    public void addAll(int index, E[] array) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        for (E element : array) {
            add(index++, element);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }

        Node<E> current = firstElement;
        for (int i = 0; i < index; i++) {
            current = current.nextElement;
        }
        return current.element;
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }

        Node<E> current = firstElement;
        for (int i = 0; i < index; i++) {
            current = current.nextElement;
        }

        E oldElement = current.element;
        current.element= element;
        return oldElement;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.nextElement = firstElement;
            firstElement = newNode;
            if (size == 0) {
                lastElement = newNode;
            }
        } else if (index == size) {
            lastElement.nextElement = newNode;
            lastElement = newNode;
        } else {
            Node<E> prevNode = firstElement;
            for (int i = 1; i < index; i++) {
                prevNode = prevNode.nextElement;
            }
            newNode.nextElement = prevNode.nextElement;
            prevNode.nextElement = newNode;
        }
        size++;
    }

    public E removeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        E removedElement;
        if (index == 0) {
            removedElement = firstElement.element;
            firstElement = firstElement.nextElement;
            if (size == 1) {
                lastElement = null;
            }
        } else {
            Node<E> prevNode = firstElement;
            for (int i = 1; i < index; i++) {
                prevNode = prevNode.nextElement;
            }
            removedElement = prevNode.nextElement.element;
            prevNode.nextElement = prevNode.nextElement.nextElement;
            if (index == size - 1) {
                lastElement = prevNode;
            }
        }
        size--;
        return removedElement;
    }

    public int indexOf(E element) {
        int index = 0;
        Node<E> currentNode = firstElement;
        while (currentNode != null) {
            if (currentNode.element.equals(element)) {
                return index;
            }
            index++;
            currentNode = currentNode.nextElement;
        }
        return -1;
    }

    public int lastIndexOf(E element) {
        int lastIndex = -1;
        int index = 0;
        Node<E> currentNode = firstElement;
        while (currentNode != null) {
            if (currentNode.element.equals(element)) {
                lastIndex = index;
            }
            currentNode = currentNode.nextElement;
            index++;
        }
        return lastIndex;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        List<E> sublist = new LinkedList<>();
        Node<E> currentNode = firstElement;
        for (int i = 0; i < toIndex; i++) {
            if (i >= fromIndex) {
                sublist.add(currentNode.element);
            }
            currentNode = currentNode.nextElement;
        }
        return sublist;
    }

    public boolean removeAll(E[] elements) {
        boolean modified = false;
        for (E element : elements) {
            while (remove(element)) {
                modified = true;
            }
        }
        return modified;
    }

    public boolean containsAll(E... elements) {
        for (E element : elements) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = firstElement;
        while (current != null) {
            sb.append(current.element);
            if (current.nextElement != null) {
                sb.append(", ");
            }
            current = current.nextElement;
        }
        sb.append("]");
        return sb.toString();
    }

    public GenericLinkedList<E> clone() {
        try {
            GenericLinkedList<E> clone = (GenericLinkedList<E>) super.clone();
            Node<E> currentNode = firstElement;
            Node<E> previousNode = null;
            Node<E> newFirstElement = null;
            while (currentNode != null) {
                Node<E> newNode = new Node<>(currentNode.element);
                if (previousNode != null) {
                    previousNode.nextElement = newNode;
                } else {
                    newFirstElement = newNode;
                }
                previousNode = newNode;
                currentNode = currentNode.nextElement;
            }
            clone.firstElement = newFirstElement;
            clone.lastElement = previousNode;
            clone.size = size;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void clear() {
        firstElement = null;
        lastElement = null;
        size = 0;
    }
}
