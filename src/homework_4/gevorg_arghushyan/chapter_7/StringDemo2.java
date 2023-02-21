package homework_4.gevorg_arghushyan.chapter_7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strObj1 = "first line";
        String strObj2 = "second line";
        String strObj3 = strObj1;
        System.out.println("The Length of line strOb1: " + strObj1.length());
        System.out.println("The Symbol in index 3 in the line strOb1: " + strObj1.charAt(3));
        if (strObj1.equals(strObj2))
            System.out.println("The line strOb1 is equal to the line strOb2");
        else System.out.println("The line strOb1 is not equal to the line strOb2");

        if (strObj1.equals(strObj3))
            System.out.println("The line strOb1 is equal to the line strOb3 ");
        else System.out.println("line strOb1 is not equal the to line strOb3");
    }
}
