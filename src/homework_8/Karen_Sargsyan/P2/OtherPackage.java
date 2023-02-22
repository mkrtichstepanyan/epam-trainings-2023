package homework_8.Karen_Sargsyan.P2;

public class OtherPackage {

    OtherPackage() {
        homework_8.Karen_Sargsyan.P1.Protection p = new homework_8.Karen_Sargsyan.P1.Protection();
        System.out.println("other package constructor");
        System.out.println("n_pub = " + p.n_pub);
    }

}
