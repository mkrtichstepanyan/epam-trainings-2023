package homework_3.Armen_Martirosyan.Tasks;

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
        System.out.println(" 1. --------------------------------------");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" 2. --------------------------------------");
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
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length - 1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" 3. --------------------------------------");
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
            for (int j = i; j < length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" 4. --------------------------------------");
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
                System.out.print("   ");
            }
            for (int k = length; k > i; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" 5. --------------------------------------");
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
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * (length - i) - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" 6. --------------------------------------");
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
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length - 1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" 7. --------------------------------------");
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
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * (length - i) - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
