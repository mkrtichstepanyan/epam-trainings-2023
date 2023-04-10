package homework_6.garik_gharibyan.chapter_8;

class MyClass {
}

class FirstDerivedClass extends MyClass {
    int x;
}

class SecondDerivedClass extends MyClass {
    int y;
}

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

        var mc1 = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);

//        mc2.x = 10    wrong
//        mc3.y = 10    wrong
    }
}
