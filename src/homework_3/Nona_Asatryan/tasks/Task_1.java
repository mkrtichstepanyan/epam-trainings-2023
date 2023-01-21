package homework_3.Nona_Asatryan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        //drawLeftUpTriangle(6);
        //drawRightUpTriangle(5);
        //drawLeftBottomTriangle(7);
        //drawRightBottomTriangle(5);
        //drawRhombus(5);
        //drawIsoscelesTriangle(5);
        //drawBottomIsoscelesTriangle(6);
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *    *
     *    * *
     *    * * *
     *    * * * *
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
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *            *
     *          * *
     *        * * *
     *      * * * *
     *    * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
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
     *    * * * *
     *    * * *
     *    * *
     *    *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
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
     *    * * * *
     *      * * *
     *        * *
     *          *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < length - i; k++) {
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
     *       *
     *      * *
     *     * * *
     *    * * * *
     *     * * *
     *      * *
     *       *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int k = length + 1; k > i; k--)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = length - 1; i > 0; i--) {
            for (int j = length + 1; j > i; j--)
                System.out.print(" ");

            for (int k = 0; k < i; k++)
                System.out.print("* ");
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
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     *    * * * * * * * * *
     *      * * * * * * *
     *        * * * * *
     *          * * *
     *            *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = length; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
