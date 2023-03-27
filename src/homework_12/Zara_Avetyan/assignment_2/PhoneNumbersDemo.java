package homework_12.Zara_Avetyan.assignment_2;

public class PhoneNumbersDemo {
    public static void main(String[] args) {
        String fileName = "C:/Users/Admin/Desktop/RD/epam-trainings-2023/src/homework_12/Zara_Avetyan/assignment_2/phoneNumbers.txt";
        String code = "093";
        new GeneratePhoneNumbers().writeToFile(new GeneratePhoneNumbers().generatePhoneNumbers(code), fileName);
    }
}
