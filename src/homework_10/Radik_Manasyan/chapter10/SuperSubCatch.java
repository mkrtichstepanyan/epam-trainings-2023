package homework_10.Radik_Manasyan.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
        // ОШИБКА: недостижимый код!
//       catch (ArithmeticException e){
//           System.out.println("Этoт код вообще недостижим.");
//       }
    }
}
