package homework_6.Inesa_Mkrtchyan.Chapter_8;

class Access {
    public static void main(String args[]) {
        B2 subOb = new B2();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}