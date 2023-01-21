package homework_3.Diana_Melkonyan.Tasks;

public class Task_1 {

    public static void main(String[] args) {
  //      drawLeftUpTriangle(10);
        drawRightUpTriangle(10);
 //     drawLeftBottomTriangle(10);
 //       drawRightBottomTriangle(10);
 //       drawRhombus(10);
 //      drawIsoscelesTriangle(10);
 //      drawBottomIsoscelesTriangle(10);

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
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
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
            for (int j = length; j >i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
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
            for(int j = i; j<length; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
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
            for (int j = 0; j < length - i ; j++) {
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
        for (int i = 1; i <length ; i++) {
            for (int j = length; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = length; j >i ; j--) {
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
        for (int i = 1; i <=length; i++) {
            for (int j = i; j <length; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++){
                System.out.print("*");


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
        for (int i = length; i >=1 ; i--) {
            for (int j = length; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
