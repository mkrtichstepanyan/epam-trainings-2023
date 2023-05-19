package homework_18.Davit_Poghosyan;

public class Entity<K, V> {
    K key;
    V value;
    private Entity<K, V> next;

    public Entity(K key, V value) {
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

    public Entity<K, V> getNext() {
        return next;
    }

    public void setNext(Entity<K, V> next) {
        this.next = next;
    }
}
