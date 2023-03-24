package homework_14.gohar_hakobyan.chapter_14;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);

        Gen3<Integer> iOb2 = new Gen3<>(99);

        Gen3<String> strOb2 = new Gen3<>("Test of generics.");

        if (iOb2 instanceof Gen3<?>) {
            System.out.println("iOb2 is instance of Gen3");
        }

        if (iOb2 instanceof Gen<?>) {
            System.out.println("iOb2 is instance of Gen");
            System.out.println();
        }

        if (strOb2 instanceof Gen3<?>) {
            System.out.println("strOb2 is instance of Gen3");
        }

        if (strOb2 instanceof Gen<?>) {
            System.out.println("strOb2 is instance of Gen");
            System.out.println();
        }

        if (iOb instanceof Gen3<?>) {
            System.out.println("iOb is instance of Gen3");
        }

        if (iOb instanceof Gen<?>) {
            System.out.println("iOb is instance of Gen");
            System.out.println();
        }

        //The following can't be compiled because
        //generic type info does not exist at run time
        //   if (iOb2 instanceof Gen3<Integer>) {
        //    System.out.println("iOb2 is instance of Gen3<Integer");
        //    System.out.println();
    }

}

