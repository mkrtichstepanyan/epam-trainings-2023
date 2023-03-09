package homework_8.TatevKocharyan.p1;

public class Protection {
    int n=1;
    private  int n_private=2;
    protected int n_protected=3;
    public int n_public=4;

    public  Protection(){
        System.out.println("base constructor");
        System.out.println("n="+n);
        System.out.println("n_pri="+n_private);
        System.out.println("n_pro="+n_protected);
        System.out.println("n_pub="+n_public);
    }

}
