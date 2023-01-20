package homework_3.garik_gharibyan.tasks;

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
    public static void drawLeftUpTriangle(int length){

        System.out.println("1. drawLeftUpTriangle");
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
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
        System.out.println("2. drawRightUpTriangle");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - (i+1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("\n\n");
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

        System.out.println("3. drawLeftBottomTriangle");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\n\n");
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
        System.out.println("4. drawRightBottomTriangle");

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < length -i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\n\n");
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

        System.out.println("5. drawRhombus");

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length - (i+1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("   *");
            }

            System.out.println();

        }

        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < length - (i+1); j++) {
                System.out.print("   *");
            }
            System.out.println();

        }
        System.out.println("\n\n");

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
        System.out.println("6. drawIsoscelesTriangle");

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length - (i+1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (length*2-1) - 2*(length - (i+1)); j++) {
                System.out.print(" *");
            }
            for (int j = 0; j < length - (i+1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
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

        System.out.println("7. drawBottomIsoscelesTriangle");
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (length*2 -1) - 2*i; j++) {
                System.out.print(" *");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
