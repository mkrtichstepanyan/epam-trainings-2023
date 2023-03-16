package homework_12.Yeghia_Ansuryan.tasksNIO.assignment_2;

public class PhoneNumbersDemo {
    public static void main(String[] args) {
        String fileName = "src/homework_12/Yeghia_Ansuryan/tasksNIO/assignment_2/phoneNumber.txt";

        GeneratePhoneNumbers pn = new GeneratePhoneNumbers();
        String[] phoneNumbers = pn.generatePhoneNumbers("093");
        pn.writeToFile(phoneNumbers, fileName);
    }
}
