package homework_11.Ani_Barseghyan.assignment_2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeFile(String fileName, String[] data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String d : data) {
                writer.write(d + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(String.format("WriteToFile not found: %s", fileName));
        } catch (IOException e) {
            System.out.println("Error writing to file " + fileName);
        }
    }
}
