package homework_17.Shushanik_araqelyan;



import java.util.*;
import java.util.function.Consumer;

public abstract class GenericLinkedList<T> implements List<T>, Cloneable {

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


    public boolean addAll(int index, Collection<? extends T> c) {
        boolean added = false;
        for (T element : c) {
            add(index++, element);
            added = true;
        }
        return added;
    }

    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        MyListIterator it = new MyListIterator() {
            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public T previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(T t) {

            }

            @Override
            public void add(T t) {

            }
        };
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }


        public ListIterator<T> listIterator(int index) {
            if (index < 0 || index > size()) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            MyListIterator myListIterator = new MyListIterator(index) {
                @Override
                public boolean hasPrevious() {
                    return false;
                }

                @Override
                public T previous() {
                    return null;
                }

                @Override
                public int nextIndex() {
                    return 0;
                }

                @Override
                public int previousIndex() {
                    return 0;
                }

                @Override
                public void remove() {

                }

                @Override
                public void set(T t) {

                }

                @Override
                public void add(T t) {

                }
            };
            return myListIterator;
        }

    private abstract class MyListIterator implements ListIterator<T> {
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

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            ListIterator.super.forEachRemaining(action);
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
    }


    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        MyListIterator iterator = new MyListIterator() {
            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public T previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(T t) {

            }

            @Override
            public void add(T t) {

            }
        };
        while (iterator.hasNext()) {
            T element = iterator.next();
            if (!c.contains(element)) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }
}
