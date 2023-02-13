package homework_6.Roza_Petrosyan.chapter_8.LocalVar;

import homework_6.Roza_Petrosyan.chapter_8.LocalVar.MyClass;

public class TypeInferenceAndInheritance {
    static MyClass getObj(int which){
        switch (which){
            case 0: return new MyClass();
            case 1: return new FirstDerivedClass();
            default: return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        var mc = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);
    }
}
