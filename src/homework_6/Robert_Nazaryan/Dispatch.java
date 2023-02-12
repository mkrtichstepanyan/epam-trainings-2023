package homework_6.Robert_Nazaryan;

public class Dispatch {
    public static void main(String[] args) {
        AClass a = new AClass(); // object of type AClass
        BClass b = new BClass(); //object of type BClass
        CClass c = new CClass(); //object of type CClass

        AClass r; // obtain a reference of type AClass

        r =a; //r refers to an AClass object
        r.callme(); //calls AClass version of callme

        r =b; //r refers to an BClass object
        r.callme(); //calls BClass version of callme

        r =c; //r refers to an CClass object
        r.callme(); //calls CClass version of callme


    }
}
