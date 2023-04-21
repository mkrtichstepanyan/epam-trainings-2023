package homework_18.garik_gharibyan;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] array;

    private int size = 0;

    GenericMap() {
        this(DEFAULT_CAPACITY);
    }

    GenericMap(int capacity) {
        if (capacity > 0) {
            this.array = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return array.length;
    }

    public void put(K kay, V value) {
        if (size == array.length){
            extend();
        }
        Pair<K, V> pair = new Pair<>(kay, value);
        int index = getIndex(kay);
        Pair<K, V> currentPair = (Pair<K, V>) array[index];
        if (array[index] == null) {
            array[index] = pair;
            size++;
        } else {
            if (currentPair.getKay().equals(kay)) {
                currentPair.setValue(value);
            } else {
                Pair<K, V> nextPair = currentPair.next();
                if (!currentPair.hasNext()) {
                    currentPair.setNext(pair);
                    size++;
                } else {
                    while (nextPair != null) {
                        if (nextPair.getKay().equals(kay)) {
                            nextPair.setValue(value);
                            return;
                        } else if (nextPair.hasNext()) {
                            nextPair = nextPair.next();
                        } else {
                            nextPair.setNext(pair);
                            size++;
                        }

                    }
                }
            }

        }
    }

    public V get(K kay) {
        int index = getIndex(kay);

        Pair<K, V> pair = (Pair<K, V>) array[index];

        if (pair != null) {

            if (pair.getKay().equals(kay)) {
                return pair.getValue();
            } else {
                while (pair.hasNext()) {
                    if (pair.next().getKay().equals(kay)) {
                        return pair.next().getValue();
                    }
                    pair = pair.next();
                }
            }

        }
        return null;
    }

    public void extend() {
        GenericMap<K, V> newGenericMap = new GenericMap<>(array.length * 2);
        Pair<K, V> tempPair;
        for (int i = 0; i < array.length; i++) {
            tempPair = (Pair<K, V>) array[i];
            newGenericMap.put(tempPair.getKay(), tempPair.getValue());
            while (tempPair.hasNext()) {
                newGenericMap.put(tempPair.next().getKay(),tempPair.next().getValue());
                tempPair = tempPair.next();
            }
        }
        this.array = newGenericMap.array;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            Pair<K, V> pair = (Pair<K, V>) array[i];
            if (pair != null) {

                stringBuilder.append(pair).append(", ");

                while (pair.hasNext()) {
                    stringBuilder.append(pair.next()).append(", ");
                    pair = pair.next();

                }
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private int getIndex(K kay) {
        if (kay == null){
            return 0;
        }
        int hash = kay.hashCode();
        return Math.abs(hash % array.length);
    }

}
