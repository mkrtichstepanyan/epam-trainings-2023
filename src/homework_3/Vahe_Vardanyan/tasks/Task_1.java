package homework_3.Vahe_Vardanyan.tasks;

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
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("______");
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i - 1) ; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();


        }
        System.out.println("___________");


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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i )  ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println("___________________");


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
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("  ");

            }
            for (int j = 0; j < (length - i); j++) {

                System.out.print("* ");

            }

            System.out.println();


        }
        System.out.println("___________________________");
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
        for (int i = length; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length + 1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = length - 2; i > 0; i--) {
            for (int j = length + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------");


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
            for (int j = 0; j <(length - i - 1) ; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j <(i * 2 + 1) ; j++) {
                System.out.print("* ");

            }
            System.out.println();


        }
        System.out.println("____________________________");
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
        System.out.println("__________________________");
    }
}
