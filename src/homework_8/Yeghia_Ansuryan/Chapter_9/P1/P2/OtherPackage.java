package homework_8.Yeghia_Ansuryan.Chapter_9.P1.P2;

public class OtherPackage {
    OtherPackage() {
        homework_8.Yeghia_Ansuryan.Chapter_9.P1.Protection p = new homework_8.Yeghia_Ansuryan.Chapter_9.P1.Protection();
        System.out.println("other package constructor");
        System.out.println("n_pub = " + p.n_pub);
    }
}
