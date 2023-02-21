package homework_4.Gevorg_Martirosian.chapter_7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "first string";
        String strOb2 = "second string";
        String strOb3 = strOb1;

        System.out.println("the length of strOb1: " + strOb1.length());
        System.out.println("symbol at index 3 in strOb1 string: " + strOb1.charAt(3));

        if (strOb1.equals(strOb2)) {
            System.out.println("strOb1 equals strOb2");
        } else {
            System.out.println("strOb1 not equals strOb2");
        }

        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 equals strOb3");
        } else {
            System.out.println("strOb1 not equals strOb2");
        }
    }
}
