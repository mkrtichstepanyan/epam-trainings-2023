package homework_8.Anushik_Gevorgyan.p2;

public class OtherPackage {
    OtherPackage(){
        homework_8.Anushik_Gevorgyan.p1.Protection p = new homework_8.Anushik_Gevorgyan.p1.Protection();
        System.out.println("other packege constructor");
        System.out.println("n_pub " + p.n_pub );
    }
}
