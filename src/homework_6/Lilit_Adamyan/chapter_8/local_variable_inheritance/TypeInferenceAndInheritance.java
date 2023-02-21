package homework_6.Lilit_Adamyan.chapter_8.local_variable_inheritance;

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

        // mc2.x = 10;    Wrong! MyClass does not have x field
        // mc3.y = 20;    Wrong! MyClass does not have y field
    }
}
