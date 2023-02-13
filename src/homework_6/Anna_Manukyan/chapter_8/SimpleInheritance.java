package homework_6.Anna_Manukyan.chapter_8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();
        superObj.i = 10;
        superObj.j = 20;
        System.out.println("Contents of superObj: ");
        superObj.showIJ();

        System.out.println();
        subObj.k = 9;
        subObj.j = 8;
        subObj.i = 7;
        System.out.println("Contents of subObj: ");
        subObj.showK();
        subObj.sumIJK();
    }
}
