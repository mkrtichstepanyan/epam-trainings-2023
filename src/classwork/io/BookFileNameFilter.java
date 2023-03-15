package classwork.io;

import java.io.File;
import java.io.FilenameFilter;

public class BookFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".pdf");
    }
}
