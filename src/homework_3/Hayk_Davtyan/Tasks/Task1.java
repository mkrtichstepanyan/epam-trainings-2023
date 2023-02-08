package homework_3.Hayk_Davtyan.Tasks;

public class Task1 {
    public static void main(String[] args) {
//        drawLeftUpTriangle(4);
//        drawRightUpTriangle(4);
//        drawLeftBottomTriangle(4);
//        drawRightBottomTriangle(5);
//        drawRhombus(7);
//        drawIsoscelesTriangle(5);
//        drawBottomIsoscelesTriangle(4);
    }

    public static void drawLeftUpTriangle(int length) {

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawRightUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 2 * (length - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawLeftBottomTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawRightBottomTriangle(int length) {
        for (int i = length; i >= 1; i--) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void drawRhombus(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = length - 1; i >= 1; i--) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void drawIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 0; i <= length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= length - 1 - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

