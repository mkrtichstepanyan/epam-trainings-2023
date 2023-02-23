package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.NestedInterfaces;

class NestedIFDemo{
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10)){
            System.out.println("10 is not negative");
        }
        if(nif.isNotNegative(-12)){
            System.out.println("this is won't be displayed");
        }
    }
}
