package homework_4_1.Andranik_Sargsyan.chapter_7.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "first string";
        String strOb2 = "second string";
        String strOb3 = strOb1;

        System.out.println("length strOb1 is: "+strOb1.length());
        System.out.println("symbol by index 3 in string atrOb1: "+strOb1.charAt(3));

        if (strOb1.equals(strOb2)){
            System.out.println("strOb1==strOb2");
        }else {
            System.out.println("strOb1!=strOb2");
        }
        if (strOb1.equals(strOb3)){
            System.out.println("strOb1==strOb3");
        }else {
            System.out.println("strOb1!=strOb3");
        }
    }
}
