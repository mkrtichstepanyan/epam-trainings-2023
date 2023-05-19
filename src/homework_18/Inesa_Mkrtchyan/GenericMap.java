package homework_18.Inesa_Mkrtchyan;

public class GenericMap <K,V>{
    private Node<K,V>[] table;
    private int size;
    private final int DEFAULTCAPASITY = 16;
    public GenericMap(){
        table = new Node[DEFAULTCAPASITY];
        size = 0;
    }
    public GenericMap(int c){
        table = new Node[c];
        size = 0;
    }
    public void put(K key,V value){
        int index = getIndex(key);
        Node<K,V> temp = table[index];
        while(temp!= null){
            if(temp.getKey() == key){
                temp.setValue(value);
                return;
            }
            temp = temp.getNext();
        }
        Node<K,V> newNode = new Node<>(key,value);
        newNode.setNext(table[index]);
        table[index] = newNode;
        size++;
    }
    public V get(K key){
        int index = getIndex(key);
        Node<K,V> node = table[index];
        while(node != null){
            if(node.getKey().equals(key))return node.getValue();
            node = node.getNext();
        }
        return null;
    }
    public void extend() {
        size *= 2;
        Node<K, V>[] newBuckets = new Node[size];
        for (int i = 0; i < table.length; i++) {
            Node<K, V> node = table[i];
            while (node != null) {
                int newIndex = getIndex(node.getKey(), size);
                Node<K, V> next = node.getNext();
                node.setNext(newBuckets[newIndex]);
                newBuckets[newIndex] = node;
                node = next;
            }
        }
        table = newBuckets;
    }
    private int getIndex(K key){
        return key.hashCode() & 15;
    }
    private int getIndex(K key, int size) {
        return Math.abs(key.hashCode() % size);
    }
}
