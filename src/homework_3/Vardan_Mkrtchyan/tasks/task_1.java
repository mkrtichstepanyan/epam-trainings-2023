package homework_3.Vardan_Mkrtchyan.tasks;

public class task_1 {
    public static void main(String[] args) {
        drawLeftUpTriangle(4);
        drawRightUpTriangle(4);
        drawLeftBottomTriangle(4);
        drawRightBottomTriangle(4);
        drawRhombus(4);
        drawIsoscelesTriangle(4);
        drawBottomIsoscelesTriangle(4);
    }
    public static void drawLeftUpTriangle(int length){
        for(int i = 0; i < length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawRightUpTriangle(int length){
        for(int i = 0; i < length; i++){
            for(int j = length; j > i + 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawLeftBottomTriangle(int length){
        for(int i = 0; i < length; i++){
            for(int k = length; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawRightBottomTriangle(int length){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = length; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawRhombus(int length) {
        for(int i = 0; i < length; i++){
            for(int j = length; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < length; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = length; k > i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawIsoscelesTriangle(int length){
        for(int i = 0; i < length; i++){
            for(int j = length; j > i + 1; j--){
                System.out.print("  ");
            }
            for(int k = 1; k <= i * 2 + 1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int k = length * 2; k > i * 2 + 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
