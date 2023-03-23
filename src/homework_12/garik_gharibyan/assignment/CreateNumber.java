package homework_12.garik_gharibyan.assignment;

public class CreateNumber {

    public static String[] generatePhoneNumbers(String code) {
        String firstNumber = "000000";
        String[] phoneNumberArray = new String[1000000];

        String firstNumberString = code + firstNumber;
        int firstNumberInt = Integer.parseInt(firstNumberString);

        if (Integer.parseInt( code.charAt(0) +"") == 0){
            for (int i = 0; i < phoneNumberArray.length; i++) {
                phoneNumberArray[i] = "0" + firstNumberInt;
                firstNumberInt = firstNumberInt + 1;
            }
        }
        else {
            for (int i = 0; i < phoneNumberArray.length; i++) {
                phoneNumberArray[i] = "" + firstNumberInt;
                firstNumberInt = firstNumberInt + 1;
            }
        }


        return phoneNumberArray;
    }
}
