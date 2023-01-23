package homework_3.Anush_Ananyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightUpTriangle(10);
//        drawLeftBottomTriangle(10);
//        drawRightBottomTriangle(10);
//        drawRhombus(5);
//        drawIsoscelesTriangle(7);
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
        // TODO : complete the method
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
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
    public static void drawRightUpTriangle(int length) {
        // TODO : complete the method
        int last = length;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j < last) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            last--;
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
        // TODO : complete the method

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("*");
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
        // TODO : complete the method
        int first = 1;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j >= first) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            first++;
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

    public static void drawRhombus(int dept) {
        // TODO : complete the method
        int lenght = dept * 2 - 1;
        int middle = lenght / 2 + 1;
        int left = middle;
        int right = middle;
        int first = 1;
        int last= lenght;

        for (int i = 1; i <= dept-1; i++) {
            for (int j = 1; j <= lenght; j++) {
                if (j != left) {
                    System.out.print("-");
                } else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("*");
                    }
                    j = right;
                }
            }
            left--;
            right++;
            System.out.println();
        }
        for (int i = 1; i <= dept; i++) {
            for (int j = 1; j <= lenght+1; j++) {
                if (j <= last ) {
                    for (int k = first; k <= last; k++) {
                        System.out.print("*");
                        j = last;
                    }
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            first++;
            last--;
        }
        System.out.println();
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
    public static void drawIsoscelesTriangle(int dept) {
        int lenght = dept * 2 - 1;
        int middle = lenght / 2 + 1;
        int left = middle;
        int right = middle;

        for (int i = 1; i <= dept; i++) {
            for (int j = 1; j <= lenght; j++) {
                if (j != left) {
                    System.out.print("-");
                } else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("*");
                    }
                    j = right;
                }
            }
            left--;
            right++;
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
    public static void drawBottomIsoscelesTriangle(int dept) {
        int lenght = dept * 2 - 1;
        int first = 1;
        int last= lenght;

        for (int i = 1; i <= dept; i++) {
            for (int j = 1; j <= lenght+1; j++) {
                if (j <= last ) {
                    for (int k = first; k <= last; k++) {
                        System.out.print("*");
                        j = last;
                    }
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            first++;
            last--;
        }
        System.out.println();
    }
}
