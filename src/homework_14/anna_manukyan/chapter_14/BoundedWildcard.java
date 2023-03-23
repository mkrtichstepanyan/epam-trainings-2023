package homework_14.anna_manukyan.chapter_14;

public class BoundedWildcard {
    static void showXY(Coords<?> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23),

        };
        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Contents of tdlocs");
        showXY(tdlocs);
//        showXYZ(tdlocs);
//        showAll(tdlocs);

        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17),

        };
        Coords<FourD> fdlocs = new Coords<>(fd);
        System.out.println("Contents of fdlocs");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
