package homework_18.yeghia_ansuryan.chapter_15.method_references_to_static_methods;

public class MyStringOps {
    static String strReverse(String str) {

        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
