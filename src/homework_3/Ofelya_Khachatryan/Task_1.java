package homework_3.Ofelya_Khachatryan;

public class Task_1 {
    public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightUpTriangle(10);
//        drawLeftBottomTriangle(10);
//        drawRightBottomTriangle(10);
//       drawRhombus(10);
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
    public static void drawLeftUpTriangle(int length){
        // TODO : complete the method
        for (int lines = 0; lines < length; lines++) {
            for (int columns = 0; columns <= lines; columns++) {
                System.out.print("* ");
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
    public static void drawRightUpTriangle(int length){
        // TODO : complete the method
        int stars;
        int spaces;

        for (stars = 0; stars < length; stars++) {
            for (spaces = 2 * (length - stars); spaces > 2; spaces--) {
                System.out.print(" ");
            }
            for (spaces = 0; spaces <= stars; spaces++) {
                System.out.print("* ");
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
    public static void drawLeftBottomTriangle(int length){
        // TODO : complete the method
        int spaces;
        int columns;
        int stars;
        for (columns = 0; columns <= length; columns++) {
            for (stars = 0; stars <= length - columns; stars++) {
                System.out.print("* ");
            }
            for (spaces = 0; spaces <= columns; spaces++) {
                System.out.print(" ");
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
    public static void drawRightBottomTriangle(int length){
        // TODO : complete the method
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = length; k >= i; k--) {
                System.out.print("* ");
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
        // TODO : complete the method
        for (int line = 1; line <= length - 1; line++) {
            for (int b = 1; b <= length - line; b++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int a = 1; a <= line; a++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = length; k >= i; k--) {
                System.out.print("* ");
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
    public static void drawIsoscelesTriangle(int length){
        int stars;
        int spaces;
        for (stars = 1; stars <= length; stars++) {
            for (spaces = 1; spaces <= length - stars; spaces++) {
                System.out.print("  ");
            }
            for (spaces = 1; spaces <= stars * 2 - 1; spaces++) {
                System.out.print("* ");
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
    public static void drawBottomIsoscelesTriangle(int length){
        int stars;
        int spaces;
        for (stars = length - 1; stars > 0; stars--) {
            for (spaces = 1; spaces <= length - stars; spaces++) {
                System.out.print("  ");
            }
            for (spaces = 1; spaces <= stars * 2 - 1; spaces++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
