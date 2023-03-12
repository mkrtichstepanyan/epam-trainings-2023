package homework_8.Radik_manasyan.chapter9.p1;

public class Protection {
    int n  = 1;
    private int nPri = 2;
    protected int nPro = 3;
    public int nPub = 4;

    public Protection(){
        System.out.println("Кoнcтpyктop базового класса");
        System.out.println("n = " + n);
        System.out.println("nPri = " + nPri);
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
