package homework_17.aram_mehrabyan;

import java.util.*;

public class GenericLinkedList<T> {

    Node head = null;
    Node tail = null;


    //@Override
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // @Override
    public boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    //  @Override
    public boolean contains(T value) {
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current != null) {
            if (current.data == value)
                return true;
            current = current.next;
        }
        return false;
    }

    // @Override
    public Iterator iterator() {
        return null;
    }

    // @Override
    public T[] toArray() {
        T []a=(T[])new Object[size()];
        Node current=head;
        for(int i=0;i<size();i++){
            a[i]=(T)current.data;
            current=current.next;
        }
        return a;
    }


    //@Override
    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }

    }

    // @Override
    public void delete(T val) {
        int index=0;
       Node current=head;
            while(current!=null) {
                if(current.data==val){
                    remove(index);
                }

                current = current.next;
                index++;
            }

        }



    // @Override
    public void addAll(T[] a) {
       for(T arr:a){
           add(arr);
       }

    }

    // @Override
    public void addAll(int index, T[] a) {
        for(T arr:a){
            add(index,arr);
            index++;
        }

    }


    // @Override
    public void clear() {
        int size = size();
        while (head != null) {
            head = head.next;
        }
        size = 0;
    }

    // @Override
    public T get(int index) {
        int size = size();
        int count = 0;
        Node<T> current = head;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        while (count != index) {
            current = current.next;
            count++;
        }

        return current.data;
    }

    //  @Override
    public void set(int index, T val) {
        int size = size();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        current.data = val;

    }
    public void addFirst(T val){
        if (isEmpty()){
            Node newNode=new Node(val);
            head=newNode;
        }else {
            Node newNode=new Node(val);
            newNode.next=head;
            head=newNode;
        }
    }

    // @Override
    public void add(int index, T data) {
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            addFirst(data);
        }
        Node current=head;
        Node newNode=new Node(data);


        for(int i=1;i<index-1;i++){
            current=current.next;
        }

        newNode.next=current.next;
        current.next=newNode;
    }

    // @Override
    public void remove(int index) {
        int size = size();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    // @Override
    public int indexOf(T val) {
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.data == val)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // @Override
    public int lastIndexOf(T val) {
        int index=0;
        Node current=head;
        while(current!=null){
            if(current.data==val){
                return index;
            }
            index++;
            current=current.next;
        }
        return -1;
    }


    // @Override
    public List subList(int fromIndex, int toIndex) {
        int size = size();
        int index=0;
        if (fromIndex < 0 || toIndex > size||fromIndex>toIndex) {
            throw new IndexOutOfBoundsException();
        }
        List<T> l=new LinkedList<>();
        Node current=head;
        while(current!=null){
            if(index>=fromIndex&&index<=toIndex)
                l.add((T)current.data);
            current=current.next;
            index++;
        }
        return l;
    }


    // @Override
    public void removeAll(T[]a) {
        for (T arr : a) {
            delete(arr);
        }

    }

    // @Override
    public boolean containsAll(T[] a) {
        for (T arr : a) {
            if (!contains(arr))
                return false;
        }
        return true;
    }

    //  @Override

    public void print() {
        Node current = head;
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Test {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<>();
        Integer[] a = {5, 10, 3, 50};
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(50);
        //list.add(2,60);
       // list.addAll(3,a);
        //list.delete(5);
        list.print();

        //System.out.println(list.size());
        System.out.println();
        // System.out.println(list.get(2));
        //System.out.println(list.contains(100));
        //list.clear();
        //list.set(1,45);
        //System.out.println(list.indexOf(3));
        // list.remove(3);
        // list.print();
        //System.out.println(list.containsAll(a));
       //list.addAll(a);



    }
}
