package homework_3.Samvel_Hakobyan.tasks;

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
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length){
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------");

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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i - 1); j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (length - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
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
        int lenght = 5 - 2 ;
        int space = lenght - 1;
        for (int i = 0; i <= lenght; i++) {
            for (int j = 0; j <= space; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }
        space = 0;

        for (int i = lenght; i > 0 ; i--) {
            for (int j = 0; j <= space; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;

        }
        System.out.println("----------------");

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

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2 + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (length * 2 - i * 2 - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
    }
}
