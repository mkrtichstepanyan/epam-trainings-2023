package homework_14.Varsik_Pijoyan.chapter_14;

//Two-dimensional coordinates
public class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

//Three-dimensional coordinates
class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

//Four-dimensional coordinates
class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = c;
    }
}
class Coords<T extends TwoD>{
    T[] coords;

    Coords(T[] o){
        coords = o;
    }
}