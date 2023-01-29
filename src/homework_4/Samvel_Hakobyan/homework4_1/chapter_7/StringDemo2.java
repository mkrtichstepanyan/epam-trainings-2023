package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class StringDemo2 {
    public static void main(String[] args) {

        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1;

        System.out.println("Length of strOb1: " +
                strOb1.length());
        System.out.println("Char at index 3 in strOb1: "
                + strOb1.charAt(3));

    if (strOb1.equals(strOb2)){
        System.out.println("strOb1 == strOb1");
    }else {
        System.out.println("strOb1 != strOb1");
    }
    if (strOb1.equals(strOb3)){
        System.out.println("strOb1 == strOb1");
    }else {
        System.out.println("strOb1 != strOb1");
    }
    }
}