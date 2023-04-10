package homework_6.TatevKocharyan.typeInference;


public class TypeInferenceAndInheritance {
    static Myclass getObj(int which) {
        switch (which) {
            case 0:
                return new Myclass();
            case 1:
                return new FirstderivedClass();
            default:
                return new SecondDerivedClass();

        }
    }

    public static void main(String[] args) {
        var mc = getObj(0);
        var mc1 = getObj(1);
        var mc2 = getObj(2);
    }
}