package homework_18.yeghia_ansuryan;

public class GenericMap<K extends User, V extends Number> {
    private final int DEFAULT_LENGTH = 16;
    private Object[] buckets;
    private Node<K, V> existingNode;
    private Node<K, V> collisionIterNode;
    private int bucketIndex;

    GenericMap() {
        buckets = new Object[DEFAULT_LENGTH];
    }

    public void put(K key, V value) {
        if (notNullKey(key) && notNullValue(value)) {
            checkLoadFactor();
            int hash = key.hashCode();
            bucketIndex = indexCalculation(hash);
            putInto(bucketIndex, key, value, hash);
        }
    }

    public V get(K key) {
        if (notNullKey(key)) {
            V valueOnTheBucket = null;
            bucketIndex = indexCalculation(key.hashCode());
            existingNode = getNode(bucketIndex);
            if (existingNode.key.equals(key)) {
                valueOnTheBucket = existingNode.value;
            } else {
                valueOnTheBucket = checkCollisionToGetValue(key, valueOnTheBucket);
            }
            return valueOnTheBucket;
        }
        return null;
    }

    private V checkCollisionToGetValue(K key, V valueOnTheBucket) {
        collisionIterNode = existingNode;
        while (collisionIterNode.nextNode != null) {
            if (collisionIterNode.nextNode.key.equals(key)) {
                valueOnTheBucket = collisionIterNode.value;
            }
            collisionIterNode = collisionIterNode.nextNode;
        }
        return valueOnTheBucket;
    }

    private void extend() {
        Object[] extendedBuckets = new Object[buckets.length * 2];
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                existingNode = getNode(i);
                put(existingNode.key, existingNode.value);
                if (existingNode.nextNode != null) {
                    collisionRecalculation(extendedBuckets);
                }
            }
        }
        buckets = extendedBuckets;
    }

    private void collisionRecalculation(Object[] extendedBuckets) {
        collisionIterNode = existingNode.nextNode;
        while (collisionIterNode.nextNode == null) {
            put(collisionIterNode.key, collisionIterNode.value);
            collisionIterNode = collisionIterNode.nextNode;
        }
    }

    private boolean notNullKey(K key) {
        return key != null;
    }

    private boolean notNullValue(V value) {
        return value != null;
    }

    private void checkLoadFactor() {
        int notNullBucketCount = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                notNullBucketCount++;
                collisionIterNode = getNode(i);
                while (collisionIterNode.nextNode != null) {
                    collisionIterNode = collisionIterNode.nextNode;
                    notNullBucketCount++;
                }
            }
        }
        if ((notNullBucketCount / buckets.length) >= 0.75) {
            extend();
        }
    }

    private Node<K, V> getNode(int index) {
        return (Node<K, V>) buckets[index];
    }

    private int indexCalculation(int hashCode) {
        return hashCode % buckets.length - 1;
    }

    private void putInto(int bucketIndex, K key, V value, int hash) {
        Node<K, V> collisionHead;
        existingNode = getNode(bucketIndex);
        if (existingNode == null) {
            collisionHead = new Node<>(hash, key, value, null);
            buckets[bucketIndex] = collisionHead;
        } else if (existingNode.key.equals(key) && !existingNode.value.equals(value)) {
            existingNode.value = value;
        } else if (existingNode.nextNode != null) {
            collisionIterNode = existingNode;
            while (collisionIterNode.nextNode != null) {
                if (collisionIterNode.key.equals(key) && !collisionIterNode.value.equals(value)) {
                    collisionIterNode.value = value;
                }
                collisionIterNode = collisionIterNode.nextNode;
            }
        } else {
            collisionHead = new Node<>(hash, key, value, existingNode);
            buckets[bucketIndex] = collisionHead;
        }
    }

    class Node<K, V> {
        private int hashCode;
        private K key;
        private V value;
        private Node<K, V> nextNode;

        Node(int hashCode, K key, V value, Node<K, V> nextNode) {
            this.hashCode = hashCode;
            this.key = key;
            this.value = value;
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" + "hashCode=" + hashCode + ", key=" + key + ", " +
                    "value=" + value + ", next value=" + nextNode.value + '}';
        }
    }
}
