package homework_8.Varsik_Pijoyan.chapter_9.PackagesAndInheritances.MyPack;

public class Balance {
    String name;
    double bal;

    Balance(String n, double b){
        name = n;
        bal = b;
    }
    public void show(){
        if(bal < 0){
            System.out.print("-->");
            System.out.println(name + ": $" + bal);
        }
    }
}
