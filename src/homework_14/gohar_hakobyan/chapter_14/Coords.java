package homework_14.gohar_hakobyan.chapter_14;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }

    static void showXY(Coords<?> c) {
        System.out.println("Coords X Y: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Coordinates X Y Z: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y+c.coords[i].z);
            System.out.println();
        }
    }
}
