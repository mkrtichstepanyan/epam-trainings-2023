package homework_12.Roza_Petrosyan.task.assignment_two;
public class PhoneNumberDemo {
    public static void main(String[] args) {
        String fileName = "src/homework_12/Roza_Petrosyan/task/assignment_two/phoneNumber.txt";

        GeneratePhoneNumberWithNIO phn = new GeneratePhoneNumberWithNIO();
        String[] phoneNumbers = phn.generatePhoneNumbers("093");
        phn.writeToFile(phoneNumbers, fileName);
    }
}
