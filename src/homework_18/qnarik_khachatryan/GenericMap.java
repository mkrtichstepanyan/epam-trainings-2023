package homework_18.qnarik_khachatryan;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */


public class GenericMap<K, V> {
    private Pair<K, V>[] array;
    private static final int DEFAULT_CAPACITY = 16;

    private int numberOfPairs;
    private final double LOAD_FACTOR = 0.75;

    GenericMap() {
        this.array = new Pair[DEFAULT_CAPACITY];
    }

    GenericMap(int capacity) {
        this.array = new Pair[capacity];
    }

    public int getBucket(K key) {
        int hash = key.hashCode();
        return hash % array.length;
    }

    public void put(K key, V value) {
        if ((double) numberOfPairs / (double) array.length >= LOAD_FACTOR) {
            extend();
        }
        int bucket = getBucket(key); //finding bucket to put there specified pair
        Pair<K, V> head = array[bucket];  //getting current pair from our bucket
        if (head == null) { //if our linked list is empty
            array[bucket] = new Pair<>(key, value);
            numberOfPairs++;
        } else { //if our linked list is not empty
            while (head != null) {
                if (head.getKey().equals(key)) {
                    head.setValue(value);
                } else if (!head.getKey().equals(key)) {
                    Pair<K, V> pairToPut = new Pair<>(key, value, head);
                    array[bucket] = pairToPut;
                    break;
                }
            }
        }
    }

    public V get(K key) {
        int bucket = getBucket(key);
        Pair<K, V> head = array[bucket];
        while (head != null) {
            if (head.getKey().equals(key)) {
                return head.getValue();
            }
            head = head.getNextPair();
        }
        return null;
    }


    public void extend() {
        GenericMap<K, V> newGenericMap = new GenericMap<>(array.length * 2);
        for (int i = 0; i < array.length; i++) { // по бакетам нашего array
            Pair<K, V> tempPair = array[i];
            newGenericMap.put(tempPair.getKey(), tempPair.getValue());
            while (tempPair.getNextPair() != null) {
                newGenericMap.put(tempPair.getNextPair().getKey(), tempPair.getNextPair().getValue());
                tempPair = tempPair.getNextPair();
            }
        }
        this.array = newGenericMap.array;
    }
}
