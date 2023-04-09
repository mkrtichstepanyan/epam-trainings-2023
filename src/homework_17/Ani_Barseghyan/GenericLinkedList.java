package homework_17.Ani_Barseghyan;

import java.util.*;

public class GenericLinkedList<Type> implements List<Type>, Comparable<Type>, Cloneable {

    Node<Type> head;
    Node<Type> tail;


    @Override
    public int size() {
        return this.indexOf(tail);
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }


    @Override
    public Iterator<Type> iterator() {
        return new Iterator<>() {
            Node<Type> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Type next() {
                Type data = currentNode.data;
                currentNode = currentNode.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public <Type> Type[] toArray(Type[] a) {
        // not implement
        return (Type[]) new Object[0];
    }

    @Override
    public boolean add(Type element) {
        this.tailLink(element);
        return true;
    }

    private void tailLink(Type element) {
        Node<Type> last = this.tail;
        Node<Type> newNode = new Node<Type>(last, element, null);
        this.tail = newNode;
        if (last == null) {
            this.head = newNode;
        } else {
            last.next = newNode;
        }
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Type get(int index) {
        int i = indexOf(head);
        Node<Type> current = head;
        if (i < index) {
            ++i;
            current = current.next;
        }
        return current.data;
    }

    @Override
    public Type set(int index, Type element) {
        return null;
    }

    @Override
    public void add(int index, Type element) {

    }

    @Override
    public Type remove(int index) {
        return null;
    }

    public int indexOf(Object element) {
        int index = 0;
        Node<Type> node;
        if (element == null) {
            for (node = this.head; node != null; node = node.next) {
                if (node.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (node = this.head; node != null; node = node.next) {
                if (node.data.equals(element)) {
                    return index;
                }
                index++;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object element) {
        int index = this.size();
        Node<Type> node;
        if (element == null) {
            for (node = this.tail; node != null; node = node.prev) {
                --index;
                if (node.data == null) {
                    return index;
                }
            }
        } else {
            for (node = this.tail; node != null; node = node.prev) {
                --index;
                if (node.data.equals(element)) {
                    return index;
                }
            }
        }

        return index;
    }

    @Override
    public ListIterator listIterator() {
        // not implement
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // not implement
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }


    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public int compareTo(Type element) {
        Node<Type> node;
        for (node = this.head; node != null; node = node.next) {
            if ((Integer) node.data > (Integer) element) {
                return 1;
            } else if ((Integer) node.data < (Integer) element) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
