package homework_11.Roza_Petrosyan.task.assignment_two;
public class PhoneNumberDemo {
    public static void main(String[] args) {
        String fileName = "src/homework_11/Roza_Petrosyan/task/assignment_two/phoneNumber.txt";

//        GenerateAndWritePhoneNumber phn = new GenerateAndWritePhoneNumber();
//        String[] phoneNumbers = phn.generatePhoneNumbers("093");
//        phn.writeToFile(phoneNumbers, fileName);

        GeneratePhoneNumberWithNIO phn2 = new GeneratePhoneNumberWithNIO();
        String[] phoneNumbers2 = phn2.generatePhoneNumbers("093");
        phn2.writeToFile(phoneNumbers2, fileName);
    }
}
