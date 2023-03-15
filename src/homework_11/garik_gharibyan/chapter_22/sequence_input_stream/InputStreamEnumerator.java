package homework_11.garik_gharibyan.chapter_22.sequence_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    InputStreamEnumerator(Vector<String> files){
        this.files = files.elements();
    }
    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {

        try {
            return new FileInputStream(files.nextElement());
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
