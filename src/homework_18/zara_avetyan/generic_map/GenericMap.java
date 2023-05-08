package homework_18.zara_avetyan.generic_map;

public class GenericMap<V, K> {
    private Map map;
    private int size;

    private final static int DEFAULT_SIZE = 16;

    public GenericMap() {
        this.size = DEFAULT_SIZE;
        createMap(size);
    }

    public GenericMap(int size) {
        this.size = size;
        createMap(size);
    }

    private void createMap(int size) {
        map = new Map(0, size);
        Map<V, K> currentMap = map;
        for (int i = 1; i < size; i++) {
            currentMap.setNext(new Map(i, size));
            currentMap = currentMap.getNext();
        }
    }

    public String get(int key) {
        String s = "";
        for (Object v : getIndex(key).getVal()) {
            s += " | " + v;
        }
        return s + " |";
    }


    public void put(V value) {
        int key = value.hashCode() % size;
        getIndex(key).addValue(value);
    }

    public void extend() {
        Map oldMap = map;
        size *= 2;
        createMap(size);
        for (int i = 0; i < size / 2; i++) {
            for (Object v : oldMap.getVal()) {
                put((V) v);
            }
            oldMap = oldMap.getNext();
        }
    }

    private Map getIndex(int index) {
        if (index < 0 || index > size) return null;
        Map currentHead = map;
        int currentIndex=0;
        while (currentIndex++ != index) {
            currentHead = currentHead.getNext();
        }
        return currentHead;
    }
}











