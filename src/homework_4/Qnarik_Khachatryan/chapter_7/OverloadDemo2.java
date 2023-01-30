package homework_4.Qnarik_Khachatryan.chapter_7;

//Automatic type conversions apply to overloading.

class OverloadDemo2 {
    void test() {
        System.out.println("No parameters");
    }

    //Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    //Overload test for a double parameter.
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}
