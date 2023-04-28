package homework_18.garik_gharibyan;

public class Pair<K,V> {
    private final K kay;
    private V value;

    private Pair<K,V> next;
    public Pair(K kay, V value){
        this.kay = kay;
        this.value= value;
    }

    public V getValue() {
        return value;
    }

    public K getKay() {
        return kay;
    }

    public void setNext(Pair<K,V> pair){
        next = new Pair<>(pair.kay, pair.getValue());
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Pair<K,V> next(){
        return next;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    @Override
    public String toString() {
        return kay + "=" + value;
    }
}
