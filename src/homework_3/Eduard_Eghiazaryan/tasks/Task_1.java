package homework_3.Eduard_Eghiazaryan.tasks;

public class Task_1 {

    public static void main(String[] args) {
//        drawLeftUpTriangle(4);
//        drawRightUpTriangle(5);
//        drawLeftBottomTriangle(4);
//        drawRightBottomTriangle(4);
        drawRhombus(5);
//        drawIsoscelesTriangle(5);
//        drawBottomIsoscelesTriangle(5);

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
        int a = 1;
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }

            System.out.println();
           a++;

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
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length - 1; j++) {
                System.out.print("  ");
            }
            for (int j = length - i; j <= length; j++) {
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
        int a = 4;
       for (int i = 0; i < length; i++){

           for (int j = 0; j < a; j++){
               System.out.print("* ");
           }
           System.out.println();
           a--;

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
       for (int i = 0; i < length; i++){
         for (int j = 0; j < length; j++){
             System.out.println(" ");
         }
        for (int j = 0; j < length - 1; j++){
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
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < length - i; j++) {
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i -1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
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
        for (int i = 0; i < 2 * length; i = i + 2) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * length - 1; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
