package homework_8.homework_8_liana_gevorgyan.nested_interface;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if(nif.isNegative(10)){
            System.out.println("10 is not negative ");
        }
        if(nif.isNegative(-12)){
            System.out.println("this will not be displayed ");
        }
    }
}
