package homework_4.Nelli_Poghosyan.Homework4_1.Chapter_7;

class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        OverLoadDemo_1 oc = new OverLoadDemo_1();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10 , 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
        System.out.println();

        int i = 88;

        oc.test();
        oc.test(10 , 20);

        oc.test(i);
        oc.test(123.2);


    }
}
