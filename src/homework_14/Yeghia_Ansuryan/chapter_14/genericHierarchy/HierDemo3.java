package homework_14.Yeghia_Ansuryan.chapter_14.genericHierarchy;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);

        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");
        if(iOb2 instanceof Gen2<?>){
            System.out.println("iOb2 is instance  of Gen2");
        }
        if(iOb2 instanceof Gen<?>){
            System.out.println("iOb2 is instance of Gen");
        }
        System.out.println();
        if(strOb2 instanceof Gen2<?>){
            System.out.println("strOb2 is instance of Gen2");
        }
        if(strOb2 instanceof Gen<?>){
            System.out.println("strOb2 is instance of Gen");
        }
        System.out.println();

        if(iOb instanceof Gen2<?>){
            System.out.println("iOb is instance of Gen2");
        }
        if(iOb instanceof Gen<?>){
            System.out.println("iOb is instance of Gen");
        }
    }
}
