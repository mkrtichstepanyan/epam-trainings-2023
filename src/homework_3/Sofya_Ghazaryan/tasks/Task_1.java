package homework_3.Sofya_Ghazaryan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(4);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(4);
        drawRightBottomTriangle(4);
        drawRhombus(5);
        drawIsoscelesTriangle(5);
        drawBottomIsoscelesTriangle(5);

    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *@param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        System.out.println("Left Up Triangle");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
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
     *     @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        System.out.println("Right Up Triangle");

        for (int i = 0; i < length; i++) {
            for (int k = length; k > i; k--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
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
     *@param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        System.out.println("Left Bottom Triangle");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
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
        System.out.println("Right Bottom Triangle");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
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
        System.out.println("Rhombus");

        int space = length - 2;

        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < space; i++) {
            System.out.print("  ");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = space; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * length = 5
     *            *
     *          * * *
     *        * * * * *
     *      * * * * * * *
     *    * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length) {
        System.out.println("Isosceles Triangle");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2 + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();
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
        System.out.println("Bottom Isosceles Triangle");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (length * 2 - i * 2 - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
