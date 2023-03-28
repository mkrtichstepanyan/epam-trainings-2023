package homework_11.Shushanik_Araqelyan.Chapter22;

import java.io.FilenameFilter;
import java.io.*;

public class OnlyExt implements FilenameFilter {
    String ext;
    public OnlyExt(String ext){
        this.ext = "." + ext;
    }
    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }
}
