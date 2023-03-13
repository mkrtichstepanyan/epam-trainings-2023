package homework_12.Ani_Barseghyan.assignment_2;

public class PhoneNumberGenerator {
    public static String[] generatePhoneNumbers(String code) {
        String[] phoneNumber = new String[1000000];
        String firstNumber = "000000";
        int firstNumberInt = Integer.parseInt(code + firstNumber);
        for (int i = 0; i < phoneNumber.length; i++) {
            if (Integer.parseInt(code.charAt(0) + "") == 0)
                phoneNumber[i] = "0" + firstNumberInt;
            firstNumberInt++;
        }
        return phoneNumber;
    }
}
