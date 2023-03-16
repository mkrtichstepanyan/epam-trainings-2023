package homework_12.Yeghia_Ansuryan.tasksNIO.assignment_2;

import homework_11.Radik_Manasyan.phoneNumbers.GeneratePhoneNumbers;

public class PhoneNumbersDemo {
    public static void main(String[] args) {
        String fileName = "Users/yeghia.ansuryan/epam-training-2023/src/homework_11/Yeghia_Ansuryan/" +
                "tasksNIO/assignment_2/phoneNumber.txt";

        GeneratePhoneNumbers pn = new GeneratePhoneNumbers();
        String[] phoneNumbers = pn.generatePhoneNumbers("093");
        pn.writeToFile(phoneNumbers, fileName);
    }
}
