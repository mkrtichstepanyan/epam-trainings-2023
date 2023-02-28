package homework_9.garik_gharibyan.chapter_12;
 enum Apple3 {
    JonaThen(10),GoldenDel(9),RedDEl(12),Winesap(15),CordLand(8);

    private int price;

     Apple3(int p){
         price = p;
     }

     public int getPrice() {
         return price;
     }
 }

 public class EnumDemo3{
     public static void main(String[] args) {
         System.out.println("Winesap costs " + Apple3.Winesap.getPrice() + " costs.\n");

         System.out.println("All apple price");

         for (Apple3 apple:Apple3.values()) {
             System.out.println(apple + " costs " + apple.getPrice() + " costs.");
         }
     }
 }
