package homework_3.Liana_Gevorgyan.Tasks;

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
    public static void drawLeftUpTriangle(int length) {
        for (int astQty = 1; astQty <= length; astQty++) {
            for (int i = 1; i <= astQty; i++) {
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
        for (int astQty = 1; astQty <= length; astQty++) {

            for (int i = 1; i <= length; i++) {
                if(i>length-astQty) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
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

        for (int astQty = length; astQty >= 1; astQty--) {
            for (int i = 1; i <= astQty; i++) {
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

        for (int astQty = length; astQty >= 1; astQty--) {

            for (int i = 1; i <= length; i++) {
                if(i>length-astQty) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
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

        int maxQty = length * 2 - 1;
        for (int quantity = 1; quantity <= maxQty; quantity += 2) {
            int spaceCount = (maxQty - quantity) / 2;
            for (int i = 0; i < maxQty; i++) {
                if (i < spaceCount) {
                    System.out.print("  ");
                } else if (i < spaceCount + quantity) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
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

        int maxQty = length*2-1;
        for (int quantity = maxQty; quantity >= 1; quantity -= 2) {
            int spaceCount = (maxQty - quantity) / 2;
            for (int i = 0; i < maxQty; i++) {
                if (i < spaceCount) {
                    System.out.print("  ");

                } else if (i < spaceCount + quantity) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
