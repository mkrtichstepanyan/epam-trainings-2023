package homework_3.Roza_Petrosyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightUpTriangle(10);
//        drawLeftBottomTriangle(10);
//        drawRightBottomTriangle(10);
//        drawRhombus(10);
//        drawIsoscelesTriangle(10);
//        drawBottomIsoscelesTriangle(10);

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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
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
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
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
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < length; k++) {
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
        for (int i = 0; i < length - 1; i++) {
            for (int j = i; j < length - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < length; k++) {
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
            for (int j = i; j < length - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int f = 0; f < i; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    public static void drawIsoscelesTriangle(int dept){
//        int length = dept * 2 - 1;
//        int middle = length / 2 + 1;
//        int left = middle;
//        int right = middle;
//
//        for (int i = 1; i <= dept; i++) {
//            for (int j = 1; j <= length; j++) {
//                if (j != left) {
//                    System.out.print("- ");
//                } else {
//                    for (int k = left; k <= right; k++) {
//                        System.out.print("* ");
//                        j = right;
//                    }
//                }
//            }
//            left--;
//            right++;
//            System.out.println();
//        }
//    }


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
            for (int k = i; k < length; k++) {
                System.out.print("* ");
            }
            for (int f = i; f < length - 1; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    public static void drawBottomIsoscelesTriangle(int dept){
//        int length = dept * 2 - 1;
//        int left = length;
//        int right = length;
//        for (int i = 1; i <= dept; i++) {
//            for (int j = 1, k = length; j <= length && k >=1; j++, k--) {
//                if (j <= left && k <= right) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("- ");
//                }
//            }
//
//            left--;
//            right--;
//            System.out.println();
//        }
//    }
}
