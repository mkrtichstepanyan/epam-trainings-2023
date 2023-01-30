package homework_4.Levon_Harutyunyan.Chapter_7;

public class StringDemo2 {
    public static void main(String[] args) {
        String str1 = "First String";
        String str2 = "Second String";
        String str3 = str1;

        System.out.println("Lenght of str1: " + str1.length());
        System.out.println("Char at index 3 in str1: " + str1.charAt(3));

        if (str1.equals(str2)){
            System.out.println("str1 == str2");
        }
        else {
            System.out.println("str1 != str2");
        }


        if (str1.equals(str3)){
            System.out.println("str1 == str3");
        }
        else {
            System.out.println("str1 != str3");
        }

        System.out.println();

        String[] str4 = { "one", "two", "three" };
        for (int i =0; i < str4.length; i++){
            System.out.println("str4 [" + i + "] : " + str4[i]);
        }
    }
}
