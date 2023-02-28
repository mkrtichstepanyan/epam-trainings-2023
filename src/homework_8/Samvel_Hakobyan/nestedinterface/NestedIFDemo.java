package homework_8.Samvel_Hakobyan.nestedinterface;

public class NestedIFDemo {
    public static void main(String[] args) {

        A.NestedF nif = new B();

        if (nif.inNotNegative(10)){
            System.out.println("10 is not negative ");
        }
        if (nif.inNotNegative(-12)){
            System.out.println("this won`t be displayed");
        }
    }
}
