package homework_11.aram_mehrabyan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SixDigit {
    static List generatePhoneNumbers(String code) {
        List<String> phoneNumbers = new ArrayList<String>();
        for (int i = 0; i <= 999999; i++) {
            phoneNumbers.add(code + String.format("%06d\n", i));
        }
        return phoneNumbers;
    }
    public static void writeFile(String filename,List<String> phonenumbers){
        String path = "/Users/Ashot Farmanyan/Desktop/aram_mehrabyan/" + filename;
        try( BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for(String str:phonenumbers)
               writer.write(str+System.lineSeparator());
        }catch (IOException e) {
            System.out.println(String.format("Error occured during write %s",filename));
        }
    }


    public static void main(String[] args) {

       // generatePhoneNumbers("093");
        writeFile("phone.txt",generatePhoneNumbers("093"));
    }
}





