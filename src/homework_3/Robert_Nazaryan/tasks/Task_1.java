package homework_3.Robert_Nazaryan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(4);
        drawRightUpTriangle(4);
        drawLeftBottomTriangle(4);
        drawRightBottomTriangle(4);
        drawRhombus(4);
        drawIsoscelesTriangle(5);
        drawBottomIsoscelesTriangle(5);

    }


    /*
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

        System.out.println("drawLeftUpTriangle:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }


    /*
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

        System.out.println("\ndrawRightUpTriangle:");
        for (int i = 0; i < length; i++) {
            for (int j = length - 2; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }


    /*
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

        System.out.println("\ndrawLeftBottomTriangle");
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    /*
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

        System.out.println("\ndrawRightBottomTriangle:");
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length - 1; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }


    /*
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

        System.out.println("\ndrawRhombus:");
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 2; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    /*
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

        System.out.println("\ndrawIsoscelesTriangle:");
        for (int i = 0; i <= length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    /*
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

        System.out.println("\ndrawIsoscelesTriangle:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length + 2; j >= i*2 - 1; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
