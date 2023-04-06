package homework_10.Eduard_Eghiazaryan;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        }catch (Exception exception){
            System.out.println("Generic ");
        }
    }
}
