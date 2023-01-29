package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equaITo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equaITo(ob3));

    }
}
