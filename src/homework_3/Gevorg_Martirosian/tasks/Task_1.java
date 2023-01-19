package homework_3.Gevorg_Martirosian.tasks;

public class Task_1 {
    public static void main(String[] args) {
        drawLeftUpTriangle(10);
        System.out.println("---------------------------");
        drawRightUpTriangle(10);
        System.out.println("---------------------------");
        drawLeftBottomTriangle(10);
        System.out.println("---------------------------");
        drawRightBottomTriangle(10);
        System.out.println("---------------------------");
        drawRhombus(10);
        System.out.println("---------------------------");
        drawIsoscelesTriangle(10);
        System.out.println("---------------------------");
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
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        //loop for rows
        for (int i = 0; i < length; i++) {
            //loop for stars in each column
            for (int j = 0; j < i + 1; j++) {
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
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        //loop for rows
        for (int i = 0; i < length; i++) {
            //loop for spaces in each column
            for (int k = 0; k < length - i - 1; k++) {
                System.out.print("  ");
            }
            //loop for stars in each column
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        //loop for rows
        for (int i = 0; i < length; i++) {
            //loop for stars in each column
            for (int j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     *       * * * *
     *         * * *
     *           * *
     *             *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        //loop for rows
        for (int i = 0; i < length; i++) {
            //loop for spaces in each column
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            //loop for stars in each column
            for (int j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     * <p>
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        //loop for rows
        int g;
        for (int i = length - 1; i >= -(length - 1); i--) {
            g = 1;
            if (i < 0) {
                g = -1;
            }
            //loop for spaces in each column
            for (int k = 0; k < i * g; k++) {
                System.out.print("  ");
            }
            //loop for stars in each column
            for (int j = 0; j < length - (i * g); j++) {
                System.out.print("*   ");
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
        //loop for rows
        for (int i = 0; i < length; i++) {
            //loop for spaces in each column
            for (int k = 0; k < length - i - 1; k++) {
                System.out.print("  ");
            }
            //loop for stars in each column
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     *   * * * * * * * * *
     *     * * * * * * *
     *       * * * * *
     *         * * *
     *           *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {
        //loop for rows
        for (int i = 0; i < length; i++) {
            //loop for spaces in each column
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            //loop for stars in each column
            for (int j = 0; j < length * 2 - 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
