package homework_17.garik_gharibyan;

import java.util.Iterator;

public class GenericLinkedList<T extends Comparable<T>> implements Cloneable {

    private MyNode<T> first;
    private MyNode<T> last;

    public MyNode<T> getFirst() {
        return first;
    }

    public MyNode<T> getLast() {
        return last;
    }

    private int size = 0;

    public boolean add(T value) {
        MyNode<T> node = new MyNode<>(value);
        if (size == 0) {
            last = node;
            first = node;
            size++;
        } else {
            last.setNext(node);
            node.setNext(null);
            last = node;
            size++;
        }
        return true;
    }

    public T get(int index) {

        if (size == 0) {
            throw new IllegalArgumentException("The GenericLinkedList is Empty");
        } else if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in to range 0-" + (size - 1));
        }

        MyNode<T> myNode = first;
        for (int i = 0; i < index; i++) {
            myNode = myNode.next();
        }
        return myNode.getElement();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int indexOf(T o) {
        MyNode<T> myNode = first;
//        if (o instanceof T){}                   ?????

        for (int i = 0; i < size; i++) {
            if (myNode.getElement().equals(o)) {
                return i;
            } else {
                myNode = myNode.next();
            }
        }
        return -1;
    }

    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    public Object[] toArray() {
        int index = 0;
        Object[] objects =  new Object[size];
        MyNode<T> myNode = first;
        while (myNode != null) {
            objects[index++] = myNode.getElement();
            myNode = myNode.next();
        }
        return objects;
    }

    public boolean remove(T o) {

        if (first.getElement().equals(o)) {
            if (size != 1) {
                first = first.next();
                first.setNext(first.next());
            } else {
                first = null;
            }
            size--;
            return true;

        }
        MyNode<T> myNode2 = first.next();
        MyNode<T> myNode1 = first;
        while (myNode2 != null) {
            if (myNode2.getElement().equals(o)) {
                myNode1.setNext(myNode2.next());
                size--;
                return true;
            }
            myNode1 = myNode2;
            myNode2 = myNode2.next();
        }
        return false;
    }

    public boolean addAll(T[] values) {
        for (T value : values) {
            this.add(value);
        }
        return true;
    }

    public boolean addAll(int index, T[] values) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("The index must be in range 0-" + size);
        }

        MyNode<T> afterValues = null;
        MyNode<T> myNode = first;
        if (index == 0 && values.length != 0) {
            MyNode<T> one = new MyNode<>(values[0]);
            first = one;
            for (int i = 0; i < values.length; i++) {
                if (i == values.length - 1) {
                    one.setNext(myNode);
                } else {
                    MyNode<T> two = new MyNode<>(values[i + 1]);
                    if (i != values.length - 1) {
                        one.setNext(two);
                        one = two;
                    }
                }

                size++;
            }

            return true;
        }
        for (int i = 1; i < index; i++) {
            myNode = myNode.next();
        }
        if (myNode.next() != null) {
            afterValues = myNode.next();
        }

        for (int i = 0; i < values.length; i++) {
            MyNode<T> newMyNode = new MyNode<>(values[i]);
            myNode.setNext(newMyNode);
            myNode = newMyNode;
            size++;
        }
        if (afterValues != null) {
            myNode.setNext(afterValues);

        }
        return true;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in range 0-" + (size - 1));
        }
        T oldElement = null;
        MyNode<T> myNode = first;
        int count = 0;
        while (count <= index) {

            if (count == index) {
                oldElement = myNode.getElement();
                myNode.setElement(element);

            }
            myNode = myNode.next();
            count++;
        }
        return oldElement;
    }

    public void addFirst(T element) {
        MyNode<T> newNode = new MyNode<>(element);
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("The index must be in range 0-" + size);
        }
        MyNode<T> newNode = new MyNode<>(element);
        MyNode<T> beforeIndexNode = first;
        MyNode<T> afterIndexNode = first;
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            add(element);
        } else {
            for (int i = 1; i < index; i++) {
                beforeIndexNode = beforeIndexNode.next();
            }
            if (beforeIndexNode.next() != null) {
                afterIndexNode = beforeIndexNode.next();
            }
            beforeIndexNode.setNext(newNode);
            if (afterIndexNode != null) {
                newNode.setNext(afterIndexNode);
            }
            size++;
        }

    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("The index must be in range 0-" + (size - 1));
        }
        MyNode<T> tempMyNode = first;
        if (index == 0) {
            if (first.next() != null) {
                first = first.next();
            } else {
                first = null;
            }
            size--;
            return tempMyNode.getElement();

        } else {
            MyNode<T> beforeIndex = null;
            MyNode<T> afterIndex = null;

            for (int i = 1; i < index; i++) {
                tempMyNode = tempMyNode.next();
            }
            beforeIndex = tempMyNode;
            MyNode<T> removed = beforeIndex.next();
            if (removed.next() != null) {
                afterIndex = removed.next();
                beforeIndex.setNext(afterIndex);
            } else {
                beforeIndex.setNext(null);
            }
            size--;
            return removed.getElement();

        }
    }

    public int lastIndexOf(T element) {
        Object[] ts = this.toArray();
        for (int i = ts.length - 1; i > 0; i--) {
            if (ts[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public GenericLinkedList<T> subList(int fromIndex, int toIndex) {
        if (size == 0) {
            throw new IllegalArgumentException("DynamicArray is Empty");
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex must be less  than toIndex");
        }
        if (fromIndex < 0) {
            throw new IllegalArgumentException("fromIndex must be bigger than 0");
        }
        if (toIndex > size) {
            throw new IllegalArgumentException("toIndex must be less  than " + size);
        }
        GenericLinkedList<T> newGenericLinkedList = new GenericLinkedList<>();
        MyNode<T> firstElementNewGenList = first;
        if (fromIndex == 0) {
            for (int i = 0; i < toIndex; i++) {
                newGenericLinkedList.add(firstElementNewGenList.getElement());
                firstElementNewGenList = firstElementNewGenList.next();
            }

        } else {
            for (int i = 0; i < fromIndex; i++) {
                firstElementNewGenList = firstElementNewGenList.next();
            }
            MyNode<T> tempNode = firstElementNewGenList;
            for (int i = fromIndex; i < toIndex; i++) {
                newGenericLinkedList.add(tempNode.getElement());
                tempNode = tempNode.next();
            }
        }
        return newGenericLinkedList;
    }

    public boolean removeAll(T[] values) {
        for (int i = 0; i < values.length; i++) {
            if (this.contains(values[i])) {
                remove(values[i]);
            }
        }
        return false;
    }

    public boolean containsAll(T[] values) {
        for (int i = 0; i < values.length; i++) {
            if (!this.contains(values[i])) {
                return false;
            }
        }
        return true;
    }

    public Iterator<T> iterator() {

        return new Iterator<T>() {
            int index = 0;
            MyNode<T> myNode = first;

            @Override
            public boolean hasNext() {
                if (index == 0){
                    return first != null;
                }
                return myNode.next() != null;

            }

            @Override
            public T next() {
                if (index == 0){
                    index++;
                    return myNode.getElement();
                }
                myNode = myNode.next();
                return myNode.getElement();
            }
        };
    }

    @Override
    public GenericLinkedList<T> clone() {
        try {
            GenericLinkedList<T> cloned = (GenericLinkedList<T>) super.clone();
            MyNode<T> clonedFirst = cloned.first;
            MyNode<T> next = first.next();

            while (next != null) {
                clonedFirst.setNext(next);
                next = next.next();
                clonedFirst = clonedFirst.next();
            }

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        MyNode<T> node = first;
        while (node != null) {

            stringBuilder.append(node.getElement());
            node = node.next();
            if (node != null) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
