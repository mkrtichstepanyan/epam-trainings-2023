package homework_3.Ani_Kovalenko.Tasks;

public class Task_1 {

    public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightUpTriangle(10);
//        drawLeftBottomTriangle(10);
        drawRightBottomTriangle(10);
//        drawRhombus(10);
//        drawIsoscelesTriangle(10);
//        drawBottomIsoscelesTriangle(10);
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        int i, j, left = length - 1;
        int depth = 10;
        for (i = 0; i < depth; i++) {
            for (j = 0; j < length; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int h = left; h < length; h++) {
                        System.out.print("* ");
                        j = h;
                    }
                }
            }
            left--;
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        int depth = 10;
        for (int a = 0; a < depth; a++) {
            for (int b = a; b < length; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        int i, j;
        for (i = 0; i < length; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }


    /**
     * lenght = 5
     * *
     * * * *
     * * * * * *
     * * * * * * * *
     * * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length) {
        int i, j;
        int depth = 5;
        int middle = length / 2;
        int left = middle, right = middle;
        for (i = 0; i <= depth; i++) {
            for (j = 0; j <= length; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int h = left; h <= right; h++) {
                        System.out.print("* ");
                        j = h;
                    }
                }
            }
            left--;
            right++;
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }


    /**
     * * * * * * * * * *
     * * * * * * * *
     * * * * * *
     * * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {
        int i, j;
        int depth = 5;
        int middle = length / 2;
        int left = 0, right = length - 2;
        for (i = 0; i < depth; i++) {
            for (j = 0; j <= length; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int h = left; h <= right; h++) {
                        System.out.print("* ");
                        j = h + 2;
                    }
                }
            }
            left++;
            right--;
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
    }
}
