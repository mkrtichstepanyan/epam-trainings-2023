package homework_14.Nona_Asatryan.chapter_14;

public class BoundedWildCard {

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.print(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.print(c.coords[i].x + " " +
                    c.coords[i].y + " " + c.coords[i].z);
            System.out.println();
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.print(c.coords[i].x + " " +
                    c.coords[i].y + " " + c.coords[i].z +
                    " " + c.coords[i].t);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };

        Coords<TwoD> tdLocs = new Coords<>(td);

        System.out.println("Contents of tdLocs");
        showXY(tdLocs);
        // showXYZ(tdLocs);
        // showAll(tdLocs);


        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Coords<FourD> fdLocs = new Coords<FourD>(fd);
        showXY(fdLocs);
        showXYZ(fdLocs);
        showAll(fdLocs);
    }
}
