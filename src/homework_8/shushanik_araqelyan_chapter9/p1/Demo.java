package homework_8.shushanik_araqelyan_chapter9.p1;

import homework_8.shushanik_araqelyan_chapter9.p1.Derived;
import homework_8.shushanik_araqelyan_chapter9.p1.Protection;
import homework_8.shushanik_araqelyan_chapter9.p1.SamePackage;

public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
