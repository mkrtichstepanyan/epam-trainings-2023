package homework_11.Sofya_Ghazaryan.assignment2;

public class Main {
    public static void main(String[] args) {
        String[] numbers = PhoneNumberGenerator.generatePhoneNumbers("077");
        String fileName = "C:\\Users\\Hp\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\phoneNumberGenerator.txt";
        PhoneNumberGenerator.writeInFile(numbers, fileName);
    }
}
