package homework_11.garik_gharibyan.chapter_22.demo_filtre_filename;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {

    String exe;
    OnlyExt(String exe){
        this.exe = "." + exe;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(exe);
    }
}
