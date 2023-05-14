package homework_18.Radik_Manasyan;


import java.util.Arrays;

/* Please create methods below
   put -> add element to MAP
   get -> get element from MAP by key
   extend -> increase buckets count and migrate elements
 */
public class GenericMap<K, V> {
    private int size;

    private Node<K, V>[] genericMap = new Node[16];


    public void put(K key, V value) {
        int hashIndex = genMapIndex(key, genericMap.length);
        if (isTimeToExtends()) {
            extend();
        }
        Node<K, V> mapObj = new Node<>(key, value, null);

        if (genericMap[hashIndex] == null) {
            genericMap[hashIndex] = mapObj;
            size++;

        } else {
            hasHead(key, value, hashIndex, mapObj);
        }
    }

    public V get(K key) {
        V value = null;
        int index = genMapIndex(key, genericMap.length);
        Node<K, V> head = genericMap[index];
        while (head != null) {
            if (head.getKey().equals(key)) {
                value = head.getValue();
                break;
            }
            head = head.next;
        }
        return value;

    }

    private void hasHead(K key, V value, int hashIndex, Node<K, V> mapObj) {
        Node<K, V> head = genericMap[hashIndex];
        while (head.next != null) {
            if (head.getKey().equals(key)) {
                head.setValue(value);
                break;
            }
            head = head.next;
        }
        if (head.getKey().equals(key)) {
            head.setValue(value);

        } else {
            head.next = mapObj;
            size++;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Node<K, V> kvNode : genericMap) {
            if(kvNode != null) {
                s.append("GenericMap" +
                         kvNode.getKey()).append("\n");
            }
        }
        return s.toString();
    }

    private int genMapIndex(K key, int arrayLength) {
        return Math.abs(key.hashCode() % arrayLength - 1);
    }

    private boolean isTimeToExtends() {
        return (size >= (genericMap.length * 75 / 100) * 10);
    }

    private void extend() {
        Node<K, V>[] tmp = new Node[genericMap.length * 2];
        for (Node<K, V> node : genericMap) {
            if (node != null) {
                int baguetteIndex = genMapIndex(node.getKey(), tmp.length);
                if (tmp[baguetteIndex] == null) {
                    tmp[baguetteIndex] = node;
                }
            }
        }
        genericMap = tmp;
    }

}

