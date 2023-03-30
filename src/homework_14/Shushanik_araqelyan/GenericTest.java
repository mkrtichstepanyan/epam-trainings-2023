package homework_14.Shushanik_araqelyan;

public class GenericTest {
    public static void main(String[] args) {
        GenericStack <String>stringGenericStack = new GenericStack<> ();
        stringGenericStack.push("The minimum");
        System.out.println(stringGenericStack);
        for (int i = 5; i < 8; i++) {
            System.out.println(stringGenericStack + "item "  +"  " + "is" +" " + i );

        }
    }

}
