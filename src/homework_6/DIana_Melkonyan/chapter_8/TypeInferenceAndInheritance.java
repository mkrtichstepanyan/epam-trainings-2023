package homework_6.DIana_Melkonyan.chapter_8;

public class TypeInferenceAndInheritance {
    //Return some type of MyClass object.
    static MyClass getObj(int which){
        switch (which){
            case 0: return new MyClass();
            case 1: return new FirstDerivedClass();
            default: return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        //Even though getObj() returns different type of
        //Object within the MyClass inheritance hierarchy,
        //its declared return type is MyClass. As a result,
        //in all three cases shown here, the type of the
        //variables is inferred to be MyClass, even though,
        //different derived types of objects are obtained.

        //Here, getObj() returns a MyClass object.
        var mc  = getObj(0);

        //In this case , a FirstDerivedClass object is returned.

        var mc2 = getObj(1);

        //Here, a SecondDerivedClass object is returned.

        var mc3 = getObj(2);

        //Because the types of both mc2 and mc3 are inferred
        //as MyClss (because the return type of getObj() is
        //MyClass, neither mc2 nor mc3 can access the fields
        //declared by FirstDerivedClass or SecondDerivedClass.
        //mc2.x =10; //Wrong! MyClass does not have an x filed.
        //mc3.y = 10;//Wrong! MyClass does not have an y filed.
    }
}
