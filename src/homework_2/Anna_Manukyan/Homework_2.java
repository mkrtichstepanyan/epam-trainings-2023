package homework_2.Anna_Manukyan;

//Calculate correct values
public class Homework_2 {
    public static void main(String[] args) {
      /* homework_2.Homework
        1. Create package with your <name_surname> in "src/homework_2" package (see example with my name in "scr/homework_2")
        2. Write all book examples in Chapter 4
        3. Create separate classes if there is need
        4. Todo Calculate and write correct values instead of "???" symbols below (Write this part of homework inside this comment -> Just replace the "???" symbols)
                   * Convert number 456 from decimal to binary = ????
                   * Convert number 01001001011 from binary to decimal = ???
                   * Convert number 450 from octal to decimal = ???
                   * Convert number 345 from decimal to octal = ???
                   * Convert number 542 from decimal to hexadecimal = ???
                   * Convert number 34F1E from hexadecimal to decimal = ???
                   Example:
                   * Convert number 2 from decimal to binary = 0000 0010
        5. Create new branch <homework_2_name_surname> -> example homework_2_mkrtich_stepanyan
        6. Commit and push into new branch
        7. Create PR and assign to your mentor
      */


        binaryConvert(456);
        System.out.println();
        decimalConvert(new int[]{0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1});
        octalToDecimalConvert(302);


        //System.out.println("Hello Students. Please read the comment above with your homework 2 description");
    }

    //Convert number  from decimal to binary = ????
    public static void binaryConvert(int number) {
        int[] decNum = new int[12];
        for (int i = 0; i < decNum.length; i++) {
            decNum[decNum.length - i - 1] = number % 2;
            number = number / 2;
        }
        for (int i = 0; i < decNum.length; i++) {
            System.out.print(decNum[i]);
        }
    }

    //Convert number  from binary to decimal = ????
    public static void decimalConvert(int[] numbers) {
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            num += numbers[i] * Math.pow(2, (numbers.length - i - 1));
        }
        System.out.println(num);
    }

    //Convert number  from octal to decimal = ????
    public static void octalToDecimalConvert(int number) {
        int num = 0;
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[numbers.length - i - 1] = number % 10;
            number = number / 10;
            num += numbers[i] * Math.pow(8, (numbers.length - i - 1));
        }
        System.out.println(num);
    }
}
