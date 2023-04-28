package homework_18.gohar_hakobyan;

public interface Entry<K, V> {

    Object get(K key);

    void put(K key, V value);

}
