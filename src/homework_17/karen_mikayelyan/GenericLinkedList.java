package homework_17.karen_mikayelyan;

import java.util.*;

public class GenericLinkedList<T> implements List<T>, Cloneable {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public GenericLinkedList() {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("List is empty");
            return true;
        }
        System.out.println("List is not empty");
        return false;
    }

    public boolean contains(Object o) {
        for (Object element : this) {
            if (element.equals(o)) {
                System.out.println("List contains " + element);
                return true;
            }
        }
        System.out.println("List does not contains element " + o);
        return false;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T item = currentNode.item;
                currentNode = currentNode.nextItem;
                return item;
            }
        };
    }

    public Object[] toArray() {
        Object[] result = new Object[size()];
        int i = 0;
        for (Object element : this) {
            result[i++] = element;
        }
        return result;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }


    public boolean add(Object o) {
        Node<T> newNode = new Node<>();
        newNode.item = (T) o;
        newNode.nextItem = null;

        if (tail == null) {
            head = newNode;
            newNode.prevItem = null;
        } else {
            tail.nextItem = newNode;
            newNode.prevItem = tail;
        }
        tail = newNode;
        size++;
        return true;
    }

    public boolean remove(Object o) {
        Iterator<Object> iterator = (Iterator<Object>) iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (Objects.equals(element, o)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        boolean added = false;
        for (T element : c) {
            if (add(element)) {
                System.out.println(element + " added");
                added = true;
            }
        }
        return added;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        boolean added = false;
        for (T element : c) {
            add(index++, element);
            added = true;
        }
        return added;
    }


    public void clear() {
        if (size > 0) {
            Node<T> current = head;
            while (current != null) {
                Node<T> next = current.nextItem;
                current.item = null;
                current.nextItem = null;
                current.prevItem = null;
                current = next;
            }
            head = tail = null;
            size = 0;
            System.out.println("List was cleared");
        }
    }

    public T get(int index) {
        LinkedListIterator iterator = (LinkedListIterator) listIterator();
        while (iterator.hasNext() && index > 0) {
            iterator.next();
            index--;
        }
        if (index == 0 && iterator.hasNext()) {
            T item = iterator.next();
            System.out.println("Item at index " + (iterator.nextIndex() - 1) + ": " + item);
            return item;
        }
        System.out.println("Index out of bounds: " + index);
        return null;
    }


    public T set(int index, T element) {
        LinkedListIterator iterator = (LinkedListIterator) listIterator();
        while (iterator.hasNext() && index > 0) {
            iterator.next();
            index--;
        }
        if (index == 0 && iterator.hasNext()) {
            T oldElement = iterator.next();
            iterator.set(element);
            System.out.println("Item at index " + (iterator.nextIndex() - 1) + " replaced : " + element);
            return oldElement;
        }
        System.out.println("Index out of bound: " + index);
        return null;
    }


    public void add(int index, Object element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }

        Node<T> newNode = new Node<T>((T) element);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else if (index == 0) {
            newNode.nextItem = head;
            head.prevItem = newNode;
            head = newNode;
        } else if (index == size) {
            newNode.prevItem = tail;
            tail.nextItem = newNode;
            tail = newNode;
        } else {
            Node<T> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.nextItem;
            }
            newNode.nextItem = currentNode;
            newNode.prevItem = currentNode.prevItem;
            currentNode.prevItem.nextItem = newNode;
            currentNode.prevItem = newNode;
        }

        size++;
    }


    public T remove(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Wrong index");
        }

        LinkedListIterator iterator = (LinkedListIterator) listIterator();
        while (iterator.hasNext() && index > 0) {
            iterator.next();
            index--;
        }
        if (index == 0 && iterator.hasNext()) {
            T removedElement = iterator.next();
            iterator.remove();
            return removedElement;
        }
        throw new IndexOutOfBoundsException("index: " + index);
    }


    public int indexOf(Object o) {
        if (size == 0) {
            return -1;
        }
        int index = 0;
        for (Object item : this) {
            if ((o == null && item == null) || (o != null && o.equals(item))) {
                System.out.println("element: " + item + " at index : " + index);
                return index;
            }
            index++;
        }
        System.out.println("element not found");
        return -1;
    }


    public int lastIndexOf(Object o) {
        Node<T> currentNode = tail;
        int index = size - 1;

        while (currentNode != null) {
            if ((o == null && currentNode.item == null) || (o != null && o.equals(currentNode.item))) {
                System.out.println("element: " + o + " at index: " + index);
                return index;
            }
            index--;
            currentNode = currentNode.prevItem;
        }
        System.out.println("Element not found");
        return -1;
    }

    public ListIterator<T> listIterator() {
        return new LinkedListIterator();
    }


    public ListIterator<T> listIterator(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        return new LinkedListIterator(index);
    }


    public GenericLinkedList<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        GenericLinkedList<T> result = new GenericLinkedList<>();
        Node<T> curr = getNodeAt(fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            result.add(curr.item);
            curr = curr.nextItem;
        }
        System.out.println(result);
        return result;
    }


    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        LinkedListIterator it = new LinkedListIterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        LinkedListIterator iterator = new LinkedListIterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            if (!c.contains(element)) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }


    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Node<T> x = head; x != null; x = x.nextItem) {
            sb.append(x.item);
            if (x.nextItem != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private Node<T> getNodeAt(int index) {
        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.nextItem;
        }
        return curr;
    }

    public Object clone() {
        GenericLinkedList<T> clone = superClone();

        clone.head = clone.head.nextItem = null;
        clone.size = 0;

        for (Node<T> elem = head; elem != null; elem = elem.nextItem)
            clone.add(elem.item);

        return clone;
    }

    private GenericLinkedList<T> superClone() {
        try {
            return (GenericLinkedList<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public int compareTo(T o) {
        Node<T> node;
        for (node = head; node != null; node = node.nextItem) {
            if ((Integer) node.item < (Integer) o) {
                return -1;
            }
        }
        return 0;
    }

    private class LinkedListIterator implements ListIterator<T> {
        private Node<T> returnedLast;
        private Node<T> next;
        private int nextIndex;

        public LinkedListIterator(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            next = (index == size) ? null : getNode(index);
            nextIndex = index;
        }

        public LinkedListIterator() {
            next = head;
            nextIndex = 0;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            returnedLast = next;
            next = next.nextItem;
            nextIndex++;
            return returnedLast.item;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public T previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            returnedLast = next = (next == null) ? tail : next.prevItem;
            nextIndex--;
            return returnedLast.item;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            if (returnedLast == null) {
                throw new IllegalStateException("No element to remove");
            }
            Node<T> nodeToRemove = returnedLast;
            returnedLast = null;
            if (nodeToRemove == head) {
                head = nodeToRemove.nextItem;
            } else {
                nodeToRemove.prevItem.nextItem = nodeToRemove.nextItem;
            }
            if (nodeToRemove == tail) {
                tail = nodeToRemove.prevItem;
            } else {
                nodeToRemove.nextItem.prevItem = nodeToRemove.prevItem;
            }
            size--;
            nextIndex--;
        }


        public void set(T element) {
            if (returnedLast == null) {
                throw new IllegalStateException();
            }
            returnedLast.item = element;
        }

        public void add(T element) {
            returnedLast = null;
            if (next == null) {
                lastLink(element);
            } else {
                linkBefore(element, next);
            }
            nextIndex++;
        }

        private Node<T> getNode(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }

            Node<T> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.nextItem;
            }
            return currentNode;
        }

        private void linkBefore(T element, Node<T> node) {
            Node<T> newNode = new Node<>(element, node, node.prevItem);
            node.prevItem = newNode;
            if (newNode.prevItem == null) {
                head = newNode;
            } else {
                newNode.prevItem.nextItem = newNode;
            }
            size++;
        }

        private void lastLink(T element) {
            Node<T> newNode = new Node<>(element, null, tail);
            if (tail == null) {
                head = newNode;
            } else {
                tail.nextItem = newNode;
            }
            tail = newNode;
            size++;
        }

    }

}
