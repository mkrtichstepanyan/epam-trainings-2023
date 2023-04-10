package homework_17.Ani_Barseghyan;

import homework_12.Radik_Manasyan.chapter21.OnlyExt;

import java.util.*;

public class GenericLinkedList<Type> implements List<Type>, Comparable<Type>, Cloneable {

    Node<Type> head;
    Node<Type> tail;


    @Override
    public int size() {
        return this.indexOf(tail.data) + 1;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object element) {
        return this.indexOf(element) >= 0;
    }


    @Override
    public Iterator<Type> iterator() {
        return new Iterator<>() {


            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Type next() {
                return null;
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
        Node<Type> newNode = new Node<>(last, element, null);
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
        for (Object o : c.toArray()) {
            this.tailLink((Type) o);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        Object[] newArr = c.toArray();
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (newArr.length == 0) {
            return false;
        } else {
            Node<Type> next;
            Node<Type> prev;
            if (index == this.size()) {
                next = null;
                prev = this.tail;
            } else {
                next = this.head.next;
                prev = this.head;
            }

            for (Object e : newArr) {
                Node<Type> newNode = new Node<>(prev, (Type) e, (Node) null);
                if (prev == null) {
                    this.head = newNode;
                } else {
                    prev.next = newNode;
                }
                prev = newNode;
            }
            if (next == null) {
                this.tail = prev;
            } else {
                prev.next = next;
                next.prev = prev;
            }
        }

        return true;
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
        int i = 0;
        Node<Type> current;

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Wrong index");
        } else {
            if (index == i) {
                current = head;
                return head.data;
            } else {
                for (Node<Type> node = head; node != null; node = node.next) {
                    i++;
                    if (index == i) {
                        current = node.next;
                        return current.data;
                    }
                }
            }
        }
        return null;
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
        return -1;
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
        boolean isContains = false;
        for (Object o : c) {
            if (this.contains(o)) {
                isContains = true;
            } else {
                isContains = false;
            }
        }

        return isContains;
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
