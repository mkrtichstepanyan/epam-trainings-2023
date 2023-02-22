package homework_8.shushanik_araqelyan_chapter9;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("other package constructor");
        System.out.println("n_pub = " + p.n_pub);
    }
}
