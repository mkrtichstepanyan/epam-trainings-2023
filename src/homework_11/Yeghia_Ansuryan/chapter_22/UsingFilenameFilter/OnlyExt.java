package homework_11.Yeghia_Ansuryan.chapter_22.UsingFilenameFilter;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
