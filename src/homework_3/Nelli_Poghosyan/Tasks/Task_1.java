package homework_3.Nelli_Poghosyan.Tasks;

public class Task_1 {

    public static void main(String[] args) {
     //   drawLeftUpTriangle(10);
     //   drawRightUpTriangle(10);
     //  drawLeftBottomTriangle(10);
     //   drawRightBottomTriangle(10);
     //   drawRhombus(10);
     //   drawIsoscelesTriangle(10);
     //   drawBottomIsoscelesTriangle(10);
     //   drawRomb(10);
        drawBottomIsoscelesTriangle1(10);
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
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
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
        int left = length;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int k = left; k <= length; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    left--;
                }
            }
            System.out.println();
        }
        System.out.println();
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
        for (int i = length; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
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
        int left = 1;
        for (int i = length; i >= 1; i--) {
            for (int j = 1; j <= length; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int k = left; k <= length; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    left++;
                }
            }
            System.out.println();
        }
        System.out.println();
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
        int pointerTop = length;
        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j != pointerTop) {
                    System.out.print(" ");
                } else {
                    for (int k = pointerTop; k <= length; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    pointerTop--;
                }
            }
            System.out.println();
        }
        int pointerBottom = 1;
        for (int i = length; i >= 1; i--) {
            for (int j = 1; j <= length; j++) {
                if (j != pointerBottom) {
                    System.out.print(" ");
                } else {
                    for (int k = pointerBottom; k <= length; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    pointerBottom++;
                }
            }
            System.out.println();
        }
        System.out.println();
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
        //calculate horizontal length of iso triangle
        int horizontalLength = length * 2 - 1;

        //left variable for left side length
        int left = length;

        //right variable for right side length
        int right = length;

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= horizontalLength; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    left--;
                    right++;

                }

            }
            System.out.println();
        }
        System.out.println();
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
        //calculate horizontal length of iso triangle
        int horizontalLength = length * 2 - 1;

        //left variable for left side length
        int left = 1;

        //right variable for right side length
        int right = horizontalLength;

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= horizontalLength; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    left++;
                    right--;

                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawBottomIsoscelesTriangle1(int length) {
        int horizontalLength = 2*length-1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = horizontalLength/2; j >i; j--) {
                System.out.print("* ");
            }
            for (int j = horizontalLength/2; j < horizontalLength-i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }


    }


    public static void drawRomb(int length) {
        //calculate horizontal length of iso triangle
        int horizontalLength = length * 2 - 1;


        //left variable for left side length
        int left = length;

        //right variable for right side length
        int right = length;

        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= horizontalLength; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    left--;
                    right++;

                }

            }
            System.out.println();
        }
        left = 1;
        right = horizontalLength;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= horizontalLength; j++) {
                if (j != left) {
                    System.out.print("  ");
                } else {
                    for (int k = left; k <= right; k++) {
                        System.out.print("* ");
                        j = j + 1;
                    }
                    left++;
                    right--;

                }

            }
            System.out.println();
        }
        System.out.println();
    }
}
