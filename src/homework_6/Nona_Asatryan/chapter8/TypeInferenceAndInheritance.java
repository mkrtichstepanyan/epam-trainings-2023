package homework_6.Nona_Asatryan.chapter8;

public class TypeInferenceAndInheritance {
    static MyClass getObj(int which) {
        switch (which) {
            case 0:
                return new MyClass();
            case 1:
                return new FirstDerivedClass();
            default:
                return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        var mc = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);
    }

//    mc2.x = 10;   Wrong! MyClass doesn't have an x field.
//    mc3.y = 10;   Wrong! MyClass doesn't have a y field.
}
