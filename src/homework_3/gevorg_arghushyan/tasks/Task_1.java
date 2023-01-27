package homework_3.gevorg_arghushyan.tasks;

public class Task_1 {
    public static void main(String[] args) {
//        drawLeftUpTriangle(4);
//        System.out.println();
//        drawRightUpTriangle(5);
//        System.out.println();
//        drawLeftBottomTriangle(4);
//        System.out.println();
//        drawRightBottomTriangle(4);
//        System.out.println();
//        drawRhombus(4);
//        System.out.println();
//        drawIsoscelesTriangle(5);
//        System.out.println();
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
    public static void drawLeftUpTriangle(int length) {
//        String str = "";
//        for (int i = 0; i < length; i++) {
//            str += "* ";
//            System.out.println(str);
//        }
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
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
    public static void drawRightUpTriangle(int length) {
//        String str = "";
//        for (int i = length; i > 0; i--) {
//            for (int j = i - 1; j > 0; j--) {
//                String str1 = "";
//                str1 += "  ";
//                System.out.print(str1);
//            }
//            str += "* ";
//            System.out.println(str);
//        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        for (int j = 0; j < length; j++) {
            for (int i = length; i > j; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
//        String str = "";
//        for (int j = length; j > 0; j--) {
//            for (int i = j - 1; i > 0; i--) {
//                System.out.print("  ");
//            }
//            str += "* ";
//            System.out.println(str);
//        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
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
        int n = 5;
        for (int i = n ; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
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
        int dept = length * 2 - 1;
        int middle = dept / 2 + 1;
        int left = middle;
        int right = middle;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= dept; j++) {
                if (j != left){
                    System.out.print("  ");
                }else{
                    for (int k = left; k <= right ; k++) {
                        System.out.print("* ");
                    }
                    j = right;
                }
            }
            left--;
            right++;
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
    public static void drawBottomIsoscelesTriangle(int length) {
        int dept = length * 2 - 1;
        int left = 1;
        int right = dept;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= dept; j++) {
                if (j != left){
                    System.out.print("  ");
                }else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("* ");
                    }
                }
            }
            left++;
            right--;
            System.out.println();
        }
    }
}


