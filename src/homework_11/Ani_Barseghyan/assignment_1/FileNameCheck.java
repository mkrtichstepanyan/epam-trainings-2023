package homework_11.Ani_Barseghyan.assignment_1;

import java.io.File;
import java.io.FileFilter;

public class FileNameCheck implements FileFilter {
    String[] extensions = {".txt", ".csv", ".json"};


    @Override
    public boolean accept(File pathname) {
        for (String extension : extensions) {
            if (pathname.getName().endsWith(extension)) {
                return true;
            }
        }
        return false;
    }
}
