package homework_18.Davit_Poghosyan;

public class GenericMap<K, V> {
   private Entity<K, V>[] map;
   private static int DEFAULT_CAPACITY = 16;
   private int size;

   public GenericMap(){
       map = new Entity[DEFAULT_CAPACITY];
   }

   public void put(K key, V value){
      int index = index(key);
      Entity newEntity = new Entity(key, value);
      if(map[index] == null){
         map[index] = newEntity;
      }else {
         Entity<K, V> previousNode = null;
         Entity<K, V> currentNode = map[index];
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
      Entity<K, V> entry = map[index];
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
   Entity<K, V>[] oldTable = map;
   map = (Entity<K, V>[]) new Entity[DEFAULT_CAPACITY];
   size = 0;

        for (Entity<K, V> node : oldTable) {
      while (node != null) {
         put(node.getKey(), node.getValue());
         node = node.getNext();
      }
   }}

   public void display(){
      for(int i = 0; i < DEFAULT_CAPACITY; i++){
         if(map[i] != null){
            Entity<K, V> currentNode = map[i];
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

