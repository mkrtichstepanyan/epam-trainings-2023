package homework_12.TatevKocharyan.chapter22;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {

    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }


    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
