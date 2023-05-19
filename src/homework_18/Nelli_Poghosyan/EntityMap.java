package homework_18.Nelli_Poghosyan;

public class EntityMap<K, V> {
    K key;
    V value;
    private  EntityMap<K, V> next;

    public EntityMap(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public EntityMap<K, V> getNext() {
        return next;
    }

    public void setNext(EntityMap<K, V> next) {
        this.next = next;
    }
}
