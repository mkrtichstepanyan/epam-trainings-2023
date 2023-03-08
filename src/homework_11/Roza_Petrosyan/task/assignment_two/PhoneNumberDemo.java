package homework_11.Roza_Petrosyan.task.assignment_two;

public class PhoneNumberDemo {
    public static void main(String[] args) {
        String fileName = "/Users/user/Desktop/RD/epam-trainings-2023/src/homework_11/Roza_Petrosyan/task/assignment_two/phoneNumber.txt";

        GenerateAndWritePhoneNumber phn = new GenerateAndWritePhoneNumber();
        String[] phoneNumbers = phn.generatePhoneNumber("093");
        phn.writeToFile(phoneNumbers, fileName);
    }
}
