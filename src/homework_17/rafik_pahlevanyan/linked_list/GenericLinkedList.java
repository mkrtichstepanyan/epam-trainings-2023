package homework_17.rafik_pahlevanyan.linked_list;

import java.util.*;

public class GenericLinkedList<T> implements List<T>, Cloneable {

    Node<T> firstItem;
    Node<T> lastItem;
    private int size = 0;

    public GenericLinkedList() {
    }

    public GenericLinkedList(int size) {
        this.size = size;
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
            private Node<T> currentNode = firstItem;

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

    public <T> T[] toArray(T[] a) {
        if (a.length < size()) {
            a = (T[]) Arrays.copyOf(a, size(), a.getClass());
        }
        int i = 0;
        for (Object element : this) {
            a[i++] = (T) element;
        }
        if (a.length > size()) {
            a[size()] = null;
        }
        return a;
    }

    public boolean add(Object o) {
        Node<T> newNode = new Node<>();
        newNode.item = (T) o;
        newNode.nextItem = null;

        if (lastItem == null) {
            firstItem = newNode;
            newNode.prevItem = null;
        } else {
            lastItem.nextItem = newNode;
            newNode.prevItem = lastItem;
        }

        lastItem = newNode;
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
                System.out.println(element + " were added");
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

    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        MyListIterator iterator = new MyListIterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            if (!c.contains(element)) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }


    public void clear() {
        if (size > 0) {
            // set all nodes to null and update size
            Node<T> current = firstItem;
            while (current != null) {
                Node<T> next = current.nextItem;
                current.item = null;
                current.nextItem = null;
                current.prevItem = null;
                current = next;
            }
            firstItem = lastItem = null;
            size = 0;
            System.out.println("List was cleared");
        }
    }


    public T get(int index) {
        MyListIterator iterator = (MyListIterator) listIterator();
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
        MyListIterator iterator = (MyListIterator) listIterator();
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
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> newNode = new Node<T>((T) element);
        if (size == 0) {
            // if list is empty, set new node as the first and last node
            firstItem = newNode;
            lastItem = newNode;
        } else if (index == 0) {
            // if index is 0, insert new node at the beginning of the list
            newNode.nextItem = firstItem;
            firstItem.prevItem = newNode;
            firstItem = newNode;
        } else if (index == size) {
            // if index is the size of the list, insert new node at the end of the list
            newNode.prevItem = lastItem;
            lastItem.nextItem = newNode;
            lastItem = newNode;
        } else {
            // find the node at the specified index and insert new node before it
            Node<T> currentNode = firstItem;
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
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        MyListIterator iterator = (MyListIterator) listIterator();
        while (iterator.hasNext() && index > 0) {
            iterator.next();
            index--;
        }
        if (index == 0 && iterator.hasNext()) {
            T removedElement = iterator.next();
            iterator.remove();
            return removedElement;
        }
        throw new IndexOutOfBoundsException("Index: " + index);
    }


    public int indexOf(Object o) {
        if (size == 0) {
            return -1;
        }
        int index = 0;
        for (Object item : this) {
            if ((o == null && item == null) || (o != null && o.equals(item))) {
                System.out.println("Element: " + item + " found in index : " + index);
                return index;
            }
            index++;
        }
        System.out.println("Element not found");
        return -1;
    }


    public int lastIndexOf(Object o) {
        Node<T> currentNode = lastItem;
        int index = size - 1;

        while (currentNode != null) {
            if ((o == null && currentNode.item == null) || (o != null && o.equals(currentNode.item))) {
                System.out.println("Element: " + o + " found at index: " + index);
                return index;
            }
            index--;
            currentNode = currentNode.prevItem;
        }
        System.out.println("Element not found");
        return -1;
    }


    public ListIterator<T> listIterator() {
        return new MyListIterator();
    }

    public ListIterator<T> listIterator(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return new MyListIterator(index);
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
        MyListIterator it = new MyListIterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
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
        for (Node<T> x = firstItem; x != null; x = x.nextItem) {
            sb.append(x.item);
            if (x.nextItem != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private Node<T> getNodeAt(int index) {
        Node<T> curr = firstItem;
        for (int i = 0; i < index; i++) {
            curr = curr.nextItem;
        }
        return curr;
    }

    private class MyListIterator implements ListIterator<T> {
        private Node<T> lastReturned;
        private Node<T> next;
        private int nextIndex;

        public MyListIterator(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            next = (index == size) ? null : getNode(index);
            nextIndex = index;
        }

        public MyListIterator() {
            next = firstItem;
            nextIndex = 0;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.nextItem;
            nextIndex++;
            return lastReturned.item;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public T previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            lastReturned = next = (next == null) ? lastItem : next.prevItem;
            nextIndex--;
            return lastReturned.item;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException("No element to remove");
            }
            Node<T> nodeToRemove = lastReturned;
            lastReturned = null;
            if (nodeToRemove == firstItem) {
                firstItem = nodeToRemove.nextItem;
            } else {
                nodeToRemove.prevItem.nextItem = nodeToRemove.nextItem;
            }
            if (nodeToRemove == lastItem) {
                lastItem = nodeToRemove.prevItem;
            } else {
                nodeToRemove.nextItem.prevItem = nodeToRemove.prevItem;
            }
            size--;
            nextIndex--;
        }


        public void set(T element) {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            lastReturned.item = element;
        }

        public void add(T element) {
            lastReturned = null;
            if (next == null) {
                linkLast(element);
            } else {
                linkBefore(element, next);
            }
            nextIndex++;
        }

        private Node<T> getNode(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }

            Node<T> currentNode = firstItem;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.nextItem;
            }
            return currentNode;
        }

        private void linkLast(T element) {
            Node<T> newNode = new Node<>(element, null, lastItem);
            if (lastItem == null) {
                firstItem = newNode;
            } else {
                lastItem.nextItem = newNode;
            }
            lastItem = newNode;
            size++;
        }

        private void linkBefore(T element, Node<T> node) {
            Node<T> newNode = new Node<>(element, node, node.prevItem);
            node.prevItem = newNode;
            if (newNode.prevItem == null) {
                firstItem = newNode;
            } else {
                newNode.prevItem.nextItem = newNode;
            }
            size++;
        }


    }


}
