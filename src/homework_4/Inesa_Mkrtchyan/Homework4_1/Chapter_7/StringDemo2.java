package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strob1 = "First String";
        String strob2 = "Second String";
        String strob3 = strob1;
        System.out.println("length of strob1: " + strob1.length());
        System.out.println("Char at index 3 in strOb1: " + strob1.charAt(3));

        if(strob1.equals(strob2))
            System.out.println("strob1 == strob2");
        else
            System.out.println("strob1 != strob2");
        if(strob1.equals(strob3))
            System.out.println("strob1 == strob3");
        else
            System.out.println("strob1 != strob3");


    }
}
