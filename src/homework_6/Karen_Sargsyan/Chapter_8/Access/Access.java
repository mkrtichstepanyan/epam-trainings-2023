package homework_6.Karen_Sargsyan.Chapter_8.Access;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 20);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }

}
