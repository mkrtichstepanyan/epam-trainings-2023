package homework_11.Ani_Barseghyan.assignment_2;

public class Demo {
    public static void main(String[] args) {
        String writeToFilePath = "C:\\Users\\ABarseghyan\\IdeaProjects\\epam-trainings-2023\\src\\homework_11\\Ani_Barseghyan\\phoneNumbers.txt";

        String code = "093";
        String[] phoneNumbers = PhoneNumberGenerator.generatePhoneNumbers(code);

        WriteToFile.writeFile(writeToFilePath, phoneNumbers);
    }
}
