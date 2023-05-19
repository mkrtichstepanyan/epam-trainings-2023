package homework_18.qnarik_khachatryan;

public class Pair<K, V> {

    private K key;
    private V value;
    private Pair<K, V> nextPair;

    public Pair(K key, V value, Pair<K, V> nextPair) {
        this.key = key;
        this.value = value;
        this.nextPair = nextPair;
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Pair<K, V> getNextPair() {
        return nextPair;
    }

}
