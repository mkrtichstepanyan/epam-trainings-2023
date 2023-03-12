package homework_8.Vahe_Vardanyan.nesedInterface;

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
