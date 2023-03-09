package homework_11.Roza_Petrosyan.task.assignment_two;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PhoneNumberDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/homework_11/Roza_Petrosyan/task/assignment_two/phoneNumber.txt");
        String fileName = "";
        if(path.getFileSystem().toString().contains("Windows")){
            fileName = String.valueOf(path.toAbsolutePath()).replace(File.separator,"/");
        } else {
            fileName = String.valueOf(path.toAbsolutePath());
        }

        GenerateAndWritePhoneNumber phn = new GenerateAndWritePhoneNumber();
        String[] phoneNumbers = phn.generatePhoneNumber("093");
        phn.writeToFile(phoneNumbers, fileName);
    }
}
