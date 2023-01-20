package homework_3.Varsik_Pijoyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
//        drawLeftUpTriangle(6);
//        drawRightUpTriangle(6);
//        drawLeftBottomTriangle(6);
//        drawRightBottomTriangle(6);
//        drawRhombus(4);
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
       for (int i = 0; i < length; i++){
           for(int j = length; j < i; j--){
               System.out.print("*");
           }
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
       for (int i = length; i >= 0; i--){
           for (int j = 1; j < i; j++){
               System.out.print(" ");
           }
           for (int k = length; k >= i; k--){
               System.out.println("*");
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
        for(int i = length; i >= 1; i--){
            for(int j = 1; j <= i; j++){
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
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length){
        for(int i = length; i >= 1; i--){
            for(int j = length; j > i; j--){
                System.out.print(" ");
            }
            for (int k=1; k < (i*2); k++){
                System.out.println("*");
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
        for (int i = 1; i <= length; i++){
            for(int j = i; j < length; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++){
                System.out.print("*");
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
        for (int i = 1; i <= length; i++){
            for(int j = i; j < length; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = length; i >= 1; i--){
            for (int j = length; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k < (i*2); k++){
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
        for (int i = length; i >= 1; i--){
            for (int j = length; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k < (i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
