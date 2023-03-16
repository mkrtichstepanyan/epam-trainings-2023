package homework_11.Yeghia_Ansuryan.tasksIO.assignment_2;

public class PhoneNumbersDemo {
    public static void main(String[] args) {
        String fileName = "/epam-training-2023/src/homework_11/Yeghia_Ansuryan/" +
                "tasksIO/assignment_2/phoneNumbers.txt";

        GeneratePhoneNumbers pn = new GeneratePhoneNumbers();
        String[] phoneNumbers = pn.generatePhoneNumbers("093");
        pn.writeToFile(phoneNumbers, fileName);
    }
}

