package homework_3.Radik_Manasyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(10);
        System.out.println();
        drawRightUpTriangle(10);
        System.out.println();
        drawLeftBottomTriangle(10);
        System.out.println();
        drawRightBottomTriangle(10);
        System.out.println("drawRhombus(11)");
        drawRhombus(11);
        System.out.println("drawRhombus(10)");
        drawRhombus(10);
        System.out.println();
        drawIsoscelesTriangle(10);
        System.out.println();
        drawBottomIsoscelesTriangle(10);

    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        // TODO : complete the method
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
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
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
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < length - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            if (i <= length / 2) {
                for (int j = 0; j < length / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                if (length % 2 != 0) {
                    for (int j = length - i; j < length / 2 + 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j < length - 1; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = length - i; j < length / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j < length; j++) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }


    /**
     * lenght = 5
     * *
     * * * *
     * * * * * *
     * * * * * * * *
     * * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length) {
        int countIterationsSymbol = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < countIterationsSymbol; j++) {
                System.out.print("* ");
            }
            countIterationsSymbol += 2;
            System.out.println();
        }
    }


    /**
     * * * * * * * * * *
     * * * * * * * *
     * * * * * *
     * * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {
        int countIterationsSymbol = 0;
        for (int i = 0; i < length; i++) {
            if (i <= length / 2) {
                if (length % 2 == 0) {
                    for (int j = 0; j <= length - countIterationsSymbol; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = 0; j < length - countIterationsSymbol; j++) {
                        System.out.print("* ");
                    }
                }

                countIterationsSymbol += 2;
                System.out.println();
            } else break;

        }
    }
}
