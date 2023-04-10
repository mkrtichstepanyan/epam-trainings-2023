package homework_14.Qnarik_Khachatryan.generic_stack;

public class GenericStackDemo {
    public static void main(String[] args) {
        GenericStack<Integer> iOb = new GenericStack<>(10);
        iOb.push(15);
        iOb.push(25);
        System.out.println(iOb.pop());

        GenericStack<String> strOb = new GenericStack<>(10);
        strOb.push("string");
        strOb.push("string2");
        System.out.println(strOb.pop());
    }
}
