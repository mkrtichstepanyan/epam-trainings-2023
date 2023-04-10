package homework_12.Sofya_Ghazaryan.assignment_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Hp\\Desktop\\RD\\epam-trainings-2023\\src\\homework_12\\Sofya_Ghazaryan\\assignment_2\\phoneNumbers.txt";


        List<String> phoneNumbers = GeneratePhoneNumber.generatePhoneNumbers("093");
        GeneratePhoneNumber.WriteIntoFile(phoneNumbers, fileName);

    }
}
