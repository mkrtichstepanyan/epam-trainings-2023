package homework_18.zara_avetyan.generic_map;

public class Map<V, K> {
    private K key;
    private Value value;
    private int valueSize;
    private Map next;


    public Map(K key, int size) {
        this.key = key;
        this.value = null;
        this.next = null;
        valueSize = 0;
    }

    public K getKey() {
        return key;
    }

    public V[] getVal() {
        Object[] arr = new Object[valueSize];
        Value val = value;
        for (int i = 0; i < valueSize; i++) {
            arr[i] = val.getValue();
            val = (Value) val.getNext();
        }
        return (V[]) arr;
    }


    public Value getValue() {
        return value;
    }


    public Map getNext() {
        return next;
    }

    public void setNext(Map next) {
        this.next = next;
    }

    public void addValue(V value) {
        Value newValue = new Value<>(value);
        newValue.setNext(this.value);
        this.value = newValue;
        valueSize++;
    }

    private class Value<V> {
        private V value;
        private V next;

        public Value(V value) {
            this.value = value;
            this.next = null;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public V getNext() {
            return next;
        }

        public void setNext(V next) {
            this.next = next;
        }
    }
}
