package homework_3.Gevorg_Martirosian.chapter_5;

//using comma in for loop (more effective version of Sample class)
public class Comma {
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
