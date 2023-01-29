package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class RetOb {
    public static void main(String[] args) {
        Test4 ob1 = new Test4(2);
        Test4 ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);




    }

}
