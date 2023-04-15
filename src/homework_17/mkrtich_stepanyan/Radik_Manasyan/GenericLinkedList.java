package homework_17.mkrtich_stepanyan.Radik_Manasyan;

import java.util.*;

public class GenericLinkedList<T> implements List<T>, Comparable, Cloneable {

    private Node<T> head;
    private int size;


    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean add(T obj) {
        Node<T> createdObj = new Node<>();
        createdObj.obj = obj;
        createdObj.next = null;
        if (head == null) {
            head = createdObj;
        } else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = createdObj;
        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        Node<T> current = head;
        System.out.print("[");
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.obj);
            } else {
                System.out.print(current.obj + ", ");
            }

            current = current.next;
        }
        System.out.print("]");

        return "";
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;
        while (current != null) {
            if (current.obj.equals((T) o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        int index = 0;
        Object[] objects = new Object[size];
        Node<T> current = head;
        while (current != null) {
            objects[index++] = current.obj;
            current = current.next;
        }
        return objects;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // not implement
        return new Object[0];
    }


    @Override
    public boolean remove(Object o) {
        Node<T> node = head;
        while (node != null) {
            if (node.next.obj.equals((T) o)) {
                node.next = node.next.next;
                size--;
                break;
            }
            node = node.next;
        }

        return false;
    }

    @Override
    public T remove(int index) {
        int nodeIndex = 0;
        Node<T> node = head;
        if (index > size - 1 || index < 0) {
            System.out.println("Index cannot be greater than " + (size - 1) + " or less than 0");
        } else {
            while (node != null) {
                if (nodeIndex++ == index - 1) {
                    node.next = node.next.next;
                    size--;
                    break;
                } else if (index == 0) {
                    head = node.next;
                    size--;
                    break;
                }
                node = node.next;
            }
        }
        return null;
    }

    @Override
    public T get(int index) {
        int nodeIndex = 0;
        Node<T> node = head;
        if (index > size - 1 || index < 0) {
            System.out.println("Index cannot be greater than " + (size - 1) + " or less than 0");
        } else {
            while (node != null) {
                if (nodeIndex++ == index) {
                    return node.obj;
                }
                node = node.next;
            }
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        int nodeIndex = 0;
        Node<T> node = head;
        Node<T> change = new Node<>();
        change.obj = element;


        if (index > size - 1 || index < 0) {
            System.out.println("Index cannot be greater than " + (size - 1) + " or less than 0");
        } else {
            while (node != null) {
                if (nodeIndex++ == index - 1) {
                    node.next = change;
                    break;
                } else if (index == 0) {
                    Node<T> tem = node.next;
                    head = change;
                    change.next = tem;
                    break;
                }
                node = node.next;
            }
        }
        return null;
    }

    @Override
    public void add(int index, T element) {
        Node<T> addElement = new Node<>();
        addElement.obj = element;
        int nodeIndex = 0;

        if (index > size - 1 || index < 0) {
            System.out.println("Index cannot be greater than " + (size - 1) + " or less than 0");
        } else {
            Node<T> node = head;
            while (node != null) {
                if (nodeIndex++ == index - 1) {
                    Node<T> tem = node.next;
                    node.next = addElement;
                    addElement.next = tem;
                    size++;
                } else if (index == 0) {
                    Node<T> tem = node;
                    head = addElement;
                    head.next = tem;
                    size++;
                    index = -1;
                }
                node = node.next;
            }
        }
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            add((T) o);
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        int nodeIndex = 0;

        if (index > size - 1 || index < 0) {
            System.out.println("Index cannot be greater than " + (size - 1) + " or less than 0");
        } else {
            Node<T> node = head;
            while (node != null) {
                if (nodeIndex++ == index - 1) {
                    node = addCollectionByIndex(c, node);

                } else if (index == 0) {
                    addCollectionWhenIndexZero(c, node);
                    break;
                }
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        head = new Node<>();
    }


    @Override
    public int indexOf(Object o) {
        Node<T> node = head;
        int objIndex = 0;
        while (node != null) {
            if (node.obj.equals(o)) {
                return objIndex;
            }
            objIndex++;
            node = node.next;
        }
        return -1;
    }


    @Override
    public boolean containsAll(Collection c) {
        Node<T> node = head;
        int containsAll = 0;
        for (Object o : c) {
            while (node != null) {
                if (node.obj.equals(o)) {
                    containsAll++;
                }
                node = node.next;
            }
        }

        if (containsAll >= c.size()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        GenericLinkedList<T> n = (GenericLinkedList<T>) o;
        int compare = -1;
        if (size == n.size()) {
            compare = 0;
        } else if (size > n.size()) {
            compare = 1;
        }
        return compare;
    }

    private Node<T> addCollectionByIndex(Collection c, Node<T> node) {
        Node<T> tem = node.next;
        int iterCount = 0;
        for (Object o : c) {
            Node<T> newNode = new Node<>();
            newNode.obj = (T) o;
            node.next = newNode;
            node = newNode;
            size++;
            if (iterCount++ == c.size() - 1) {
                node.next = tem;
                break;
            }
        }
        return node;
    }

    private void addCollectionWhenIndexZero(Collection c, Node<T> node) {
        Node<T> tem = node;
        int iterCount = 0;
        for (Object o : c) {
            Node<T> newNode = new Node<>();
            newNode.obj = (T) o;
            if (iterCount++ == 0) {
                head = newNode;
                node = head;
                size++;
            } else {
                node.next = newNode;
                node = newNode;
                size++;
            }
        }
        node.next = tem;
    }


    // not implement
    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

}
