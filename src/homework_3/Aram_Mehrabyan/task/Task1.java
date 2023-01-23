package homework_3.Aram_Mehrabyan.task;

public class Task1 {
    public static void main(String[] args) {
//       drawLeftUpTriangle(10);//
 //      drawRightUpTriangle(10);
//        drawLeftBottomTriangle(5);
 //      drawRightBottomTriangle(5);
        //      drawRhombus(5);
//        drawIsoscelesTriangle(5);
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
        for(int i=0;i<length;i++){
            for ( int j=0;j<i+1;j++)
                System.out.print('*');
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
        // TODO : complete the method
        for(int i=0;i<length;i++){
            for ( int j=1;j<length-i;j++){
                System.out.print(' ');
            }
            for (int k=0;k<=i;k++){
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
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length){
        // TODO : complete the method
        int k=length;
        for(int i=0;i<length;i++){
            for ( int j=0;j<k;j++){
                System.out.print("* ");
            }
            k--;
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
        // TODO : complete the method
        for(int i=0;i<length;i++){
            for ( int j=0;j<i;j++){
                System.out.print(' ');
            }
            for (int k=i;k<length;k++){
                System.out.print("*");
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
        for(int i=0;i<length;i++){
            for ( int j=0;j<length-i;j++){
                System.out.print(' ');
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<length-1;i++){
            for ( int j=0;j<=i;j++){
                System.out.print(' ');
            }
            for (int k=1;k<length-i;k++){
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
    public static void drawIsoscelesTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
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
        for (int i =length; i >= 1; i--) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
