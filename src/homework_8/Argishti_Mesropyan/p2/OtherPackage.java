package homework_8.Argishti_Mesropyan.p2;

import homework_8.Argishti_Mesropyan.p1.Protection;

class OtherPackage {
    OtherPackage() {
    Protection p = new Protection();
        System.out.println("other package constructor");
        System.out.println("n_pub = " + p.n_pub);
    }
}
