package homework_3.Inesa_Mkrtchyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(10);
        drawRightUpTriangle(10);
        drawLeftBottomTriangle(10);
        drawRightBottomTriangle(10);
        drawRhombus(10);
        drawIsoscelesTriangle(10);
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
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length){
        for(int i = 0; i < length;i++){
            for(int j = 0; j <= i;j++){
                System.out.print('*');
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
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length){
        for(int i = 0; i < length; i++){
            for(int j = length-1;j >=0;j--){
                if(j > i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
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
        for (int i = 0; i < length; i++){
            for(int j = length-1;j > i;j--){
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
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(j < i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
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
        for(int i = 1; i <= length; i++){
            for(int j = 0; j < length-i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = length-1; i >= 0; i--){
            for(int j = 0; j < length-i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
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
        for(int i = 1; i <= length; i++){
            for(int j = 0; j < length-i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
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
        for(int i = length-1; i >= 0; i--){
            for(int j = 0; j < length-i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
