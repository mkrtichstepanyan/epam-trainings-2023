package homework_8.Hovhannes_Gspeyan.chapter_9.p1;

public class Protection {

    int n = 1;
    private int nPri = 2;
    protected int nPro = 3;
    public int nPub = 4;

    public Protection(){
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + nPri);
        System.out.println("n_pro = " + nPro);
        System.out.println("n_pub = " + nPub);

    }
}
