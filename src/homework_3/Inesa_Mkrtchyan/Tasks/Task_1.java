package homework_3.Inesa_Mkrtchyan.Tasks;
public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(4);
        System.out.println();
        drawRightUpTriangle(4);
        System.out.println();
        drawLeftBottomTriangle(4);
        System.out.println();
        drawRightBottomTriangle(4);
        System.out.println();
        drawRhombus(4);
        System.out.println();
        drawIsoscelesTriangle(4);
        System.out.println();
        drawBottomIsoscelesTriangle(4);
        System.out.println();

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
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length){
        for(int i = 0; i < length; i++){
            for(int j = length-1;j >=0;j--){
                if(j > i){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
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
        for (int i = 0; i <= length; i++){
            for(int j = length;j > i;j--){
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
                    System.out.print("* ");
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
        for (int i = 1, j = 1; i <= length; i++, j += 2) {
            for (int b = length - i; b >= 1; b--) {
                System.out.print("  ");
            }
            for (int n = 0; n < j; n++) {
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
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int n = length + 2; n >= (2 * i); n--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
