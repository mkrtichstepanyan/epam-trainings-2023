package homework_11.Ani_Barseghyan.assignment_1;

import java.io.*;
import java.util.Arrays;

public class FileReadWrite extends FileNameCheck {
    static FileNameCheck checkName = new FileNameCheck();

    public static String readFile(String fileName) {
        if (checkName.accept(new File(fileName))) {
            String data = null;
            String line;
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                data = reader.readLine() + "\n";
                while ((line = reader.readLine()) != null) {
                    data += line + "\n";
                }

            } catch (FileNotFoundException e) {
                System.out.println(String.format("FileReadWrite not found: %s", fileName));
            } catch (IOException e) {
                System.out.println("Error writing to file " + fileName);
            }
            return data;
        } else {
            System.out.println("Only the following extensions are supported: " + Arrays.toString(checkName.extensions));
        }
        return fileName;
    }

    public static void writeFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            if (data != null) {
                String modifiedData = processData(data);
                writer.write(modifiedData);
            }

        } catch (FileNotFoundException e) {
            System.out.println(String.format("FileReadWrite not found: %s", fileName));
        } catch (IOException e) {
            System.out.println("Error writing to file " + fileName);
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
}
