package homework_3.Anna_Manukyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(10);
        System.out.println();
        drawRightUpTriangle(10);
        System.out.println();
        drawLeftBottomTriangle(10);
        System.out.println();
        drawRightBottomTriangle(10);
        System.out.println();
        drawRhombus(10);
        System.out.println();
        drawIsoscelesTriangle(10);
        System.out.println();
        drawBottomIsoscelesTriangle(10);

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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
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
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int k = length - i; k <= length; k++) {
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
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j >= i) {
                    System.out.print("* ");
                }
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < length - i; j++) {
                System.out.print(" *");
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
        int bigLength = length + 2;
//        for (int i = 0; i < bigLength; i++) {
//            for (int j = 0; j < bigLength - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = bigLength - i; k <= bigLength; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int k = length - i; k <= length; k++) {
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
    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < length - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
