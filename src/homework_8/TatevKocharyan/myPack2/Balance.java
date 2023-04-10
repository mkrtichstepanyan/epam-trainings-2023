package homework_8.TatevKocharyan.myPack2;

public class Balance {
    public String name;
    public double bal;
    public Balance(String n, double b){
        name=n;
        bal=b;
    }
    void  show(){
        if (bal<0)
            System.out.println("---->");
        System.out.println(name+":$"+bal);
    }
}
