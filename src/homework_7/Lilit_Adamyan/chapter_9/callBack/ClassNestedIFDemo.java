package homework_7.Lilit_Adamyan.chapter_9.callBack;

public class ClassNestedIFDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if(nif.isNotNegative(10)){
            System.out.println("10 is not negative");
        }if(nif.isNotNegative(-12)){
            System.out.println("This wont be displayed");
        }
    }
}
