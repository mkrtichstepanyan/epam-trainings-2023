package homework_8.Inesa_Mkrtchyan.Chapter_9.P1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;
    public Protection(){
        System.out.println("base constructior");
        System.out.println("n = " + n);
        //System.out.println("n_pri = " + n_pri);//Error!!!
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
