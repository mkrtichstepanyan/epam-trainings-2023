package homework_19.qnarik_khachatryan.chapter_15;

//Demonstrate a method reference to an instance method

//A functional interface for string operations.
interface StringFunc2 {
    String func(String n);
}

//Now this class defines an instance method called strReverse().
class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
