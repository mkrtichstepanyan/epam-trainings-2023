package homework_11.Qnarik_Khachatryan.Assignment_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import java.util.Arrays;

public class Assignment_2 {

    public static final String code = "093";
    public static String[] phoneNumbers = new String[1000000];

    public static int start = 0;
    public static int finish = 999999;
    public static int startIndex = 0;


    public static void main(String[] args) {
        generatePhoneNumber(code);
        writeToFile(phoneNumbers, "src/homework_11/Qnarik_Khachatryan/" +
                "Assignment_2/fileToWrite.txt");

    }

    public static String[] generatePhoneNumber(String code) {
        NumberFormat formatter = new DecimalFormat("000000");
        for (int i = start; i <= finish; i++) {
            phoneNumbers[startIndex++] = code + formatter.format(i) + "\n";
        }
        return phoneNumbers;
//        System.out.println(Arrays.toString(phoneNumbers));
    }

    public static void writeToFile(String[] phoneNumbers, String fileName){
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            for (int i = 0; i < phoneNumbers.length; i ++) {
                fileOutputStream.write(phoneNumbers[i].getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


