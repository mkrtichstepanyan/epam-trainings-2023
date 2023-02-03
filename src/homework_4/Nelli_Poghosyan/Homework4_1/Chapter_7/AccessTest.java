package homework_4.Nelli_Poghosyan.Homework4_1.Chapter_7;

class AccessTest {
    public static void main(String[] args) {
        Test_2 ob = new Test_2();

        ob.a = 10;
        ob.b = 20;
        ob.setc(100);

        System.out.println("a , b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
