package homework_3.TatevKocharyan.chapter5;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("tick " + n);
            n--;
        } while (n > 0);
    }
}
/*   more efficiently

        do{
      System.out.println("tick " + n);
     }while(--n>0);     */