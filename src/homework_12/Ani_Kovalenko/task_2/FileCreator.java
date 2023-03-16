package homework_12.Ani_Kovalenko.task_2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class FileCreator {
    String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1000000];
        int incrementableNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + String.format("%06d", incrementableNumber) + "\n";
            incrementableNumber++;
        }


//        Version 2
//
//
//        String zeros = "000000";
//        int index2 = zeros.length() - 1;
//        int arrayIndex = 0;
//        String perNumber;
//        for (int i = 0;i<numbers.length;i++){
//            perNumber = code.concat(zeros.substring(0,index2)).concat(String.valueOf(incrementableNumber)).concat("\n");
//            numbers[arrayIndex++] = perNumber;
//            incrementableNumber++;
//            switch (incrementableNumber){
//                case 10, 100, 1000, 10000, 100000:
//                    index2--;
//                    break;
//            }
//        }
        return numbers;
    }


    void writeToFile(String[] phoneNumbers, String fileName) {
        ByteBuffer buffer;
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            for (String perNumber : phoneNumbers) {
                buffer = ByteBuffer.wrap(perNumber.getBytes());
                if (perNumber != null) {
                    channel.write(buffer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
