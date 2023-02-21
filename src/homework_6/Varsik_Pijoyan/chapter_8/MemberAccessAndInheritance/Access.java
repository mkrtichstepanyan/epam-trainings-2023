package homework_6.Varsik_Pijoyan.chapter_8.MemberAccessAndInheritance;

public class Access {
    public static void main(String[] args) {
        B2 subOb = new B2();

        subOb.setIJ(10, 12);
        subOb.sum();
        System.out.println("Total is: " + subOb.total);
        System.out.println("Total equals 0, because j was private to the A2 class(was not accessible)!");
        System.out.println("But if j wasn't private, total will be equals 22");
    }
}
