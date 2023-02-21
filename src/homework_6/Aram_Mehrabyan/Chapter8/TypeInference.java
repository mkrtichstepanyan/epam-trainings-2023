package homework_6.Aram_Mehrabyan.Chapter8;
class MyClass{
    //...
}
class FirstDerivedClass extends MyClass{
    int x;
    //...
}
class SecondDerivedClass extends FirstDerivedClass{
    int y;
    //...
}
public class TypeInference {
    static MyClass getobj(int wich){
        switch (wich){
            case 0: return new MyClass();
            case 1:return new FirstDerivedClass();
            default:return new SecondDerivedClass();
        }
    }


    public static void main(String[] args) {
    var mc=getobj(0);
    var mc2=getobj(1);
    var mc3=getobj(2);
    }
}
