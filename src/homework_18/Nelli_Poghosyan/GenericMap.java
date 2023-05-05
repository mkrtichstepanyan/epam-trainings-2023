package homework_18.Nelli_Poghosyan;

import homework_18.Varsik_Pijoyan.genericMap.Entry;

public class GenericMap<K, V> {
   private EntityMap<K, V> [] map;
   private static int DEFAULT_CAPACITY = 16;
   private int size;

   public GenericMap(){
       map = new EntityMap[DEFAULT_CAPACITY];
   }

   public void put(K key, V value){
      int index = index(key);
      EntityMap newEntity = new EntityMap(key, value);
      if(map[index] == null){
         map[index] = newEntity;
      }else {
         EntityMap<K, V> previousNode = null;
         EntityMap<K, V> currentNode = map[index];
         while(currentNode != null){
            if(currentNode.getKey().equals(key)){
               currentNode.setValue(value);
               break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
         }
         if(previousNode != null)
            previousNode.setNext(newEntity);
      }
   }

   private int index(K key){
      if(key == null){
         return 0;
      }
      return Math.abs(key.hashCode() % DEFAULT_CAPACITY);
   }

   public V get(K key){
      V value = null;
      int index = index(key);
      EntityMap<K, V> entry = map[index];
      while (entry != null){
         if(entry.getKey().equals(key)) {
            value = entry.getValue();
            break;
         }
         entry = entry.getNext();
      }
      return value;
   }
public void extend(){
   DEFAULT_CAPACITY *= 2;
   EntityMap<K, V>[] oldTable = map;
   map = (EntityMap<K, V>[]) new EntityMap[DEFAULT_CAPACITY];
   size = 0;

        for (EntityMap<K, V> node : oldTable) {
      while (node != null) {
         put(node.getKey(), node.getValue());
         node = node.getNext();
      }
   }}

   public void display(){
      for(int i = 0; i < DEFAULT_CAPACITY; i++){
         if(map[i] != null){
            EntityMap<K, V> currentNode = map[i];
            while (currentNode != null){
               System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
               currentNode = currentNode.getNext();
            }
         }
      }
   }

   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }
}

