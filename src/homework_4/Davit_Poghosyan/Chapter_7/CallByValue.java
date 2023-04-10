package homework_4.Davit_Poghosyan.chapter_6.Chapter_7;

class CallByValue {
    public static void main(String[] args) {
        Test_1 ob = new Test_1();

        int a = 15 , b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a , b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
