package homework_3.shushanik_araqelyan.tasks;

public class Task_1 {



    public static void main(String[] args) {
        //drawLeftUpTriangle(5);
         //drawRightUpTriangle(5);
         //drawLeftBottomTriangle(5);
         drawRightBottomTriangle(10);
        //drawRhombus(10);
        //drawIsoscelesTriangle(5);
        // drawBottomIsoscelesTriangle(10);

    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *@param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");

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
     *     @param length  specified length of triangle will be drawn
     */

    public static void drawRightUpTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
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
    * @param length specified length of triangle will be drawn
    */
        public static void drawLeftBottomTriangle( int length) {


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
        public static void drawRightBottomTriangle ( int length){
            // TODO : complete the method
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <=length ; --j) {
                    System.out.println();
                }
                System.out.println(" *");
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
        public static void drawRhombus ( int length) {

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
    public static void drawIsoscelesTriangle ( int length){
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
     public static void drawBottomIsoscelesTriangle ( int length){
     }
    }
