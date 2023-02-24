package homework_7.Lilit_Adamyan.chapter_9.callBack;

public class Balance {
    String name;
    double bal;

     Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show(){
         if(bal<0){
             System.out.println("--> ");
             System.out.println(name + ": $ " + bal);
         }
    }
}
