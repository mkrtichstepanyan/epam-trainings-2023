package homework_8.Inesa_Mkrtchyan.Chapter_9.NestedClass;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10)){
            System.out.println("10 is not negative");
        }
        if(nif.isNotNegative(-12)){
            System.out.println("This won't be displayed");
        }
    }
}
