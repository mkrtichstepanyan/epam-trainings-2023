package homework_6.Anna_Manukyan.chapter_8;

public class Access {
    public static void main(String[] args) {
        BWithMemberAccess subObj = new BWithMemberAccess();
        subObj.setIJ(10,20);
        subObj.sum();
        System.out.println("Total is " +subObj.total);

    }
}
