package homework_10.Vahe_Vardanyan;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }catch (Exception e){
            System.out.println("Generic Exception catch. ");
        }

    }
}
