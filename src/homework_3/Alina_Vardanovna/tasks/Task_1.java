package homework_3.Alina_Vardanovna.tasks;

public class Task_1 {

    public static void main(String[] args) {

//        drawLeftUpTriangle(10);
//        drawRightUpTriangle(10);
//        drawLeftBottomTriangle(10);
//        drawRightBottomTriangle(10);
//        drawRhombus(10);
//        drawIsoscelesTriangle(5);
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

    public void drawLeftUpTriangle(int length, char c) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
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

    public void drawRightUpTriangle(int length, char c) {
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + c);
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

    public void drawLeftBottomTriangle(int length, char c) {
        for (int i = length; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
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

    public void drawRightBottomTriangle(int length, char c) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = length - 1; k >= i; k--) {
                System.out.print(" " + c);
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

    public void drawRhombus(int length, char c) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
        for (int j = length - 2; j >= 0; j--) {
            for (int k = length - 1; k >= j; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++) {
                System.out.print(" " + c);
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

    public void drawIsoscelesTriangle(int length, char c) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(c + " ");
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

    public static void drawBottomIsoscelesTriangle(int length, char c) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < length * 2 - i * 2 - 1; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}
