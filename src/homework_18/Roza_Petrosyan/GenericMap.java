package homework_18.Roza_Petrosyan;

import java.util.ArrayList;
import java.util.LinkedList;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<T, E> {
    private final int INITIAL_CAPACITY = 16;
    private int newCapacity = 0;
    ArrayList<LinkedList<Entry<T, E>>> list = new ArrayList<>(INITIAL_CAPACITY);

    GenericMap() {
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(T key, E value) {
        if(key == null) {
            key = (T)"null";
        }
        if(value == null) {
            value = (E)"null";
        }
        int capacity;
        if (newCapacity > 0) {
            capacity = newCapacity;
        } else {
            capacity = INITIAL_CAPACITY;
        }
        int index = key.hashCode() % capacity;
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (list.get(i).get(j).getKey().equals(key)) {
                    list.get(i).remove(list.get(i).get(j));
                }
                if ((float) j / capacity > 0.75f) {
                    extend(i);
                }
            }
            if (i == index) {
                list.get(i).add(new Entry<>(key, value));
            }
        }
    }

    public E get(T key) {
        for (LinkedList<Entry<T, E>> entries : list) {
            for (Entry<T, E> entry : entries) {
                if (entry.getKey().equals(key)) {
                    return (E) entry.getValue();
                }
            }
        }
        return null;
    }

    public void extend(int item) {
        newCapacity = INITIAL_CAPACITY * 2;
        ArrayList<LinkedList<Entry<T, E>>> newlist = new ArrayList<>(newCapacity);
        newlist.addAll(list);
        for (int i = INITIAL_CAPACITY + 1; i <= newCapacity; i++) {
            newlist.add(new LinkedList<>());
        }
        list = newlist;

        for (int j = 0; j < list.get(item).size(); j++) {
            put(list.get(item).get(j).getKey(), get(list.get(item).get(j).getKey()));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (LinkedList<Entry<T, E>> linkedList : list) {
            for (Entry<T, E> entry : linkedList) {
                sb.append(entry).append(", ");
            }
        }
        return sb.toString();
    }
}
