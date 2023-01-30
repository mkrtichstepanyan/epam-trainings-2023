package homework_4.Qnarik_Khachatryan.chapter_7;

class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i); // this will invoke test (double)
        ob.test(123.2); // this will invoke test (double)
    }
}
