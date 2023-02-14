package homework_4.Nelli_Poghosyan.Homework4_1.Chapter_7;

class OverLoadDemo_1 {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Inside test(double) a: " + a);


    }
}