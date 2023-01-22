package homework_3.Qnarik_Khachatryan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(10);
//        drawRightUpTriangle(10);
//        drawLeftBottomTriangle(10);
//        drawRightBottomTriangle(10);
//        drawRhombus(10);
//        drawIsoscelesTriangle(10);
//        drawBottomIsoscelesTriangle(10);
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            if (i == length) {  // not to print the last empty string
                break;
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            if (i == length) {
                break;
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print("* ");
            }
            if (i == length - 1) {
                break;
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = length; k >= i; k--) {
                System.out.print("* ");
            }
            if (i == length) {
                break;
            }
            System.out.println();
        }
    }


    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length  specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= length - i; k++) {
                System.out.print("* ");
            }
            if (i == length - 1) {
                break;
            }
            System.out.println();
        }
    }


    /**
     * lenght = 5
     *            *
     *          * * *
     *        * * * * *
     *      * * * * * * *
     *    * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("* ");
            }
            if (i == length) {
                break;
            }
            System.out.println();
        }
    }


    /**
     *
     *   * * * * * * * * *
     *     * * * * * * *
     *       * * * * *
     *         * * *
     *           *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = length * 2 - 1; k >= i + i - 1; k--) {
                System.out.print("* ");
            }
            if (i == length) {
                break;
            }
            System.out.println();
        }

    }
}
