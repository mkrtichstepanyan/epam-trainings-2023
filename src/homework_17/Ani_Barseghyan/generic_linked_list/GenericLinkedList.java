package homework_17.Ani_Barseghyan.generic_linked_list;

import java.util.*;

public class GenericLinkedList<Type> implements List<Type>, Cloneable {

    Node<Type> head;
    Node<Type> tail;
    private int size;

    public GenericLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
        Object[] array = new Object[size];
        int i = 0;
        for (Node<Type> item = head; item != null; item = item.next) {
            array[i++] = item.data;
        }
        return array;
    }


    @Override
    public <Type> Type[] toArray(Type[] a) {
        // not implement
        return (Type[]) new Object[0];
    }

    @Override
    public boolean add(Type element) {
        this.tailLink(element);
        this.size++;
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
    public boolean remove(Object o) {
        if (o != null) {
            for (Node<Type> item = head; item != null; item = item.next) {
                if (o.equals(item.data)) {
                    this.unLink(item);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c.toArray()) {
            this.tailLink((Type) o);
            this.size++;
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
        this.size += newArr.length;
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        // not implement
        return false;
    }

    @Override
    public void clear() {
        this.size = 0;

    }

    @Override
    public Type get(int index) {
        int i = 0;
        Node<Type> current = null;

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Wrong index");
        } else {
            if (index == i) {
                current = head;

            } else {
                for (Node<Type> node = head; node != null; node = node.next) {
                    i++;
                    if (index == i) {
                        current = node.next;
                    }
                }
            }
        }
        return current.data;
    }

    Node<Type> node(int index) {
        Node current;
        int i;
        if (index < this.size()) {
            current = this.head;

            for (i = 0; i < index; ++i) {
                current = current.next;
            }

        } else {
            current = this.tail;

            for (i = this.size - 1; i > index; --i) {
                current = current.prev;
            }

        }
        return current;
    }

    @Override
    public Type set(int index, Type element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<Type> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;

        }
        Type oldValue = current.data;
        current.data = element;
        return oldValue;
    }

    @Override
    public void add(int index, Type element) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        Node<Type> next;
        Node<Type> prev;
        if (index == this.size()) {
            next = null;
            prev = this.tail;
        } else {
            next = this.head.next;
            prev = this.head;
        }
        Node<Type> newNode = new Node<>(prev, element, (Node) null);
        if (prev == null) {
            this.head = newNode;
        } else {
            prev.next = newNode;
        }
        prev = newNode;

        if (next == null) {
            this.tail = prev;
        } else {
            prev.next = next;
            next.prev = prev;
        }
        this.size++;

    }

    @Override
    public Type remove(int index) {
        return this.unLink(this.node(index));
    }

    public Type unLink(Node<Type> element) {
        Type current = element.data;
        if (element.prev == null) {
            head = element.next;
        } else {
            element.prev.next = element.next;
            element.next.prev = element.prev;
        }
        element.data = null;
        size--;
        return current;
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
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        GenericLinkedList<Type> subList = new GenericLinkedList<>();
        Node<Type> current = head;
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(current.data);
            current = current.next;
        }
        return subList;
    }


    @Override
    public boolean removeAll(Collection c) {
        boolean removedAll = false;
        for (Object o : c) {
            if (this.contains(o)) {
                removedAll = remove(o);
            }
        }
        return removedAll;
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
}
