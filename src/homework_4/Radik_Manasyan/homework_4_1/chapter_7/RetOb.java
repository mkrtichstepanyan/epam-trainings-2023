package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class RetOb {
    public static void main(String[] args) {
        Test3 ob1 = new Test3(2);
        Test3 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("оЬ2.а после второго увеличения значения: " + ob2.a);
    }
}
