package homework_7.Lilit_Adamyan.chapter_9.my_pack;

public class Balance {
    String name;
    double bal;

   public Balance(String n, double b) {
        name = n;
        bal = b;
    }

   public void show(){
        if(bal<0){
            System.out.println("--> ");
            System.out.println(name + ": $ " + bal);
        }
    }
}
