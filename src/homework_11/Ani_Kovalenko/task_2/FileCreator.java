package homework_11.Ani_Kovalenko.task_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileCreator {
    String filePath = "C:\\Users\\HP\\Desktop\\";
    BufferedWriter writer;

    String[] generatePhoneNumbers(String code) {
        int index = 0;
        String[] numbers = new String[1000000];
        int incrementableNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + String.format("%06d", incrementableNumber) + "\n";
            incrementableNumber++;
        }


//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 9; j++) {
//                perNumber = String.valueOf(stringBuilder.append(code).append(b).append("\n"));
//                b[index2]++;
//                numbers[index] = perNumber;
//            }
//            index2--;
//        }


//        do {
//            perNumber = code.concat(incrementableNumber).concat("       ");
//            tempValue = Integer.valueOf(incrementableNumber);
//            tempValue++;
//            incrementableNumber = String.valueOf(tempValue);
        //


//        do {
//            do {
//                perNumber = code.concat(a).concat("\n");
//                numbers[index++] = perNumber;
//
//                tempValue=a.charAt(index2)+1;;
//            } while (tempValue == 10);
//            index2--;
//        } while (index2 < 0);


//        do {
//                do {
//                    b[index2]++;
//                    incrementableNumber = String.valueOf(b);
//                    perNumber = code.concat(incrementableNumber).concat("\n");
//                    numbers[index++] = perNumber;
//                } while (b[index2] == 10);
//                index2--;
//            } while (index2 < 0);


//        } while (tempValue < Integer.valueOf("999999"));
        return numbers;
    }


    void writeToFile(String[] phoneNumbers, String fileName) {
        try {
            writer = new BufferedWriter(new FileWriter(filePath.concat(fileName)));
            for (String perNumber : phoneNumbers) {
                if (perNumber != null) {
                    writer.write(perNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
