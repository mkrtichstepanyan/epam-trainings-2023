package homework_4.Ani_Barseghyan.chapter_7;

public class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.c: " + ob1.c);
        System.out.println("ob2.c: " + ob2.c);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.c after second increase: " + ob2.c);
    }
}
