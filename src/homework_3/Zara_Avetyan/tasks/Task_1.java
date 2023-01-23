package homework_3.Zara_Avetyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
        drawIsoscelesTriangle(5);
        drawBottomIsoscelesTriangle(5);

    }


    public static void drawLeftUpTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void drawRightUpTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i <= length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void drawRightBottomTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void drawRhombus(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
        for (int i = 1; i <= length; i++) {
            System.out.print("  ");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < length; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }


    public static void drawIsoscelesTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= length; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
