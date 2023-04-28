package homework_17.Inesa_Mkrtchyan;

import java.util.Collection;
import java.util.List;

public class LinkedListGeneric <T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;
    public LinkedListGeneric(){
        size = -1;
    }
    public void Print(){
        Node<T> Temp = head;
        while(Temp != null){
            System.out.println(Temp.getValue() + ", ");
            Temp = Temp.getNext();
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size > -1;
    }
    public boolean contains(T o) {
        Node<T> temp = head;
        while(temp != null){
            if(temp.getValue() == o){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    public T[] toArray() {
        if(size < 0) return null;//or throw new NullPointerException("you haven't members in your List")
        T[] arr = (T[]) new Object[size+1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = get(i);
        }
        return arr;
    }

    public boolean add(T o) {
        if(size == -1){
            head = new Node<T>(o,tail,null);
            size++;
            return true;
        }
        if(size == 0){
            Node<T> temp = new Node<T>(o,null,head);
            head.setNext(temp);
            tail = temp;
            size++;
            return true;
        }
        if(size > 0){
            Node<T> temp = new Node<T>(o,null,tail);
            tail.setNext(temp);
            tail = temp;
            size++;
            return true;
        }
        return false;
    }
    public boolean remove(T o) {
        Node<T> temp = head;
        while(temp != null){
            if(temp.getValue().equals(o)){
                temp.getPrevue().setNext(temp.getNext());
                temp.getNext().setPrevue(temp.getPrevue());
                size--;
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    public boolean addAll(T[] c) {
        for(T i : c){
            add(i);
        }
        return true;
    }
    public boolean addAll(int index, T[] c) {
        for(T i : c){
            add(index,i);
            index++;
        }
        return false;
    }
    public void clear() {
        head = null;
        tail = null;
        size = -1;
    }
    public T get(int index) {
        Node<T> temp = head;
        int i = 0;
        while(temp != null){
            if(i == index) return temp.getValue();
            i++;
            temp = temp.getNext();
        }
        return null;
    }
    private Node getNodeByIndex(int index){
        Node<T> temp = head;
        int i = 0;
        while(temp != null){
            if(i == index) return temp;
            i++;
            temp = temp.getNext();
        }
        return null;
    }
    public T set(int index, T element) {
        Node<T> selectedIndex = getNodeByIndex(index);
        if(selectedIndex != null){
            selectedIndex.setValue(element);
        }
        return null;
    }
    public void add(int index, T element) {
        Node<T> selectedIndex = getNodeByIndex(index);
        if(selectedIndex.getNext() == null) add(element);
        if(selectedIndex != null){
            Node<T> elem = new Node<T>(element,selectedIndex.getNext(),selectedIndex);
            selectedIndex.setNext(elem);
            elem.getNext().setPrevue(elem);
        }
        size++;
    }
    public T remove(int index) {
        Node<T> forRemovie = getNodeByIndex(index);
        forRemovie.getPrevue().setNext(forRemovie.getNext());
        forRemovie.getNext().setPrevue(forRemovie.getPrevue());
        size--;
        return forRemovie.getValue();
    }
    public int indexOf(T o) {
        Node<T> temp = head;
        int findindex = 0;
        while(temp != null){
            if(temp.getValue() == o){
                return findindex;
            }
            temp = temp.getNext();
            findindex++;
        }
        return -1;
    }
    public int lastIndexOf(T o) {
        return indexOf(o);
    }
    public LinkedListGeneric subList(int fromIndex, int toIndex) {
        LinkedListGeneric<T> newList = new LinkedListGeneric<T>();
        for(int i = fromIndex; i <= toIndex; i++){
            newList.add(get(i));

        }
        return newList;
    }
    public boolean removeAll(T[] c) {
        for (T item:c) {
            remove(item);
        }
        return false;
    }
    public boolean containsAll(T[] c) {
        for(T item : c){
            if(indexOf(item) == -1) return false;
        }
        return true;
    }
}
