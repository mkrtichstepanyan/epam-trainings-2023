package homework_3.Ani_Barseghyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
//        drawLeftUpTriangle(4);
//        drawRightUpTriangle(5);
//        drawLeftBottomTriangle(4);
//        drawRightBottomTriangle(4);
//        drawRhombus(7);
//        drawIsoscelesTriangle(5);
        drawBottomIsoscelesTriangle(5);
//        drawRhombusNew(5);

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
        // TODO : complete the method

        for (int i = 0; i <= length; i++) {
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
        // TODO : complete the method

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - 1 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
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
    public static void drawLeftBottomTriangle(int length) {
        // TODO : complete the method

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" *");
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
    public static void drawRightBottomTriangle(int length) {
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < length - i; j++) {
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
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < (length - 1 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = length - 1; i > 1; i--) {
            for (int j = 0; j < (length - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i; j++) {
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - 1 - i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
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
    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * (length - i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawRhombusNew(int depth) {
        int length = depth * 2 - 1;
        int middle = length / 2 + 1;
        int left = middle;
        int right = middle;
        int left1 = 2;
        int right1 = length-1;

        for (int i = 1; i <= depth; i++) {
            for (int j = 1; j <= length; j++) {

                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("* ");
                        j = right;
                    }
                }
            }
            left--;
            right++;
            System.out.println();
        }

        for (int i = depth + 1; i < 2 * depth; i++) {
            for (int j = 1; j <= length; j++) {
                if (j != left1) {
                    System.out.print("  ");
                } else {
                    for (int k = left1; k <= right1; k++) {
                        System.out.print("* ");
                        j = right1;
                    }
                }
            }
            right1--;
            left1++;
            System.out.println();
        }
    }
}
