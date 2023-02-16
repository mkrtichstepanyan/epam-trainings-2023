package homework_6.Hovhannes_Gspeyan.chapter_8;

public class TypeInferenceAndInheritance {

    static MyClass getObj(int which){
        return switch (which) {
            case 0 -> new MyClass();
            case 1 -> new FirstDerivedClass();
            default -> new SecondDerivedClass();
        };
    }

    public static void main(String[] args) {
        var mc = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);

     //   mc2.x = 10; WRONG! MyClass does not have an x or y field
     //   mc3.y = 10;
    }
}
