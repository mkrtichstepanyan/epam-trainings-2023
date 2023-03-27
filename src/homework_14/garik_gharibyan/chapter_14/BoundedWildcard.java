package homework_14.garik_gharibyan.chapter_14;

class TwoD {
    int x, y;

    TwoD(int a, int b) {
        this.x = a;
        this.y = b;
    }

}

class TreeD extends TwoD {
    int z;

    TreeD(int a, int b, int c) {
        super(a, b);
        this.z = c;
    }
}

class FourD extends TreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        this.t = d;
    }
}

class Coords<T extends TwoD> {

    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

public class BoundedWildcard {
    public static void main(String[] args) {

        TwoD[] td = new TwoD[]{
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4),
                new TwoD(-1,-23),
        };

        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Context of tdlocs.");
        showXY(tdlocs);
//        showAll(tdlocs);   Error
//        showAll(tdlocs);   Error

       FourD[] fd = new FourD[]{
               new FourD(1,2,3,4),
               new FourD(6,8,14,8),
               new FourD(22,4,9,22),
               new FourD(3,-3,-22,17)
       };
       Coords<FourD> fdlocs= new Coords<>(fd);
        showXY(fdlocs);
        showAll(fdlocs);
        showAll(fdlocs);

    }

    static void showXY(Coords<?> coords) {
        System.out.println("X Y Coordinates: ");
        for (int i = 0; i < coords.coords.length; i++) {
            System.out.print(coords.coords[i].x + " " + coords.coords[i].y);
            System.out.println();
        }

    }

    static void showXYZ(Coords<? extends TreeD> coords) {
        System.out.println("X Y Z Coordinates: ");
        for (int i = 0; i < coords.coords.length; i++) {
            System.out.print(coords.coords[i].x + " " + coords.coords[i].y + " " + coords.coords[i].z);
            System.out.println();
        }
    }

    static void showAll(Coords<? extends FourD> coords) {
        System.out.println("X Y Z T Coordinates: ");
        for (int i = 0; i < coords.coords.length; i++) {
            System.out.print(
                    coords.coords[i].x + " " +
                            coords.coords[i].y + " " +
                            coords.coords[i].z + " " +
                            coords.coords[i].t);
            System.out.println();
        }
    }

}
