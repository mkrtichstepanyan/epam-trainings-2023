package homework_3.Ani_Kovalenko.Chapter_5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer: {
        for(int i = 0; i < 3; i++){
            System.out.print("Pass " + i + ":");
            for(int j =0; j<100; j++){
                if (j == 10) break outer;
                System.out.print(j + " ");
            }
        }
            System.out.println("This will not print");
        }
        System.out.println();
        System.out.println("This one will be printed");
    }
}
