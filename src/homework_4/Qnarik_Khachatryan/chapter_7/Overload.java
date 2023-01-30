package homework_4.Qnarik_Khachatryan.chapter_7;

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        //call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 10);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}
