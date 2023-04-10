package homework_13.Ani_Kovalenko.search;

import java.io.File;

public class Main {

    /**
     * 1. fileNamePattern -> test_file  +
     * 2. fileNamePattern -> *file      +
     * 3. fileNamePattern -> *st_fi*    +
     * 4. fileNamePattern -> test*fi*   +
     * 5. fileNamePattern -> *st*file   +
     * 6. fileNamePattern -> test*      +
     * 7. fileNamePattern -> test*file  +
     * 8. fileNamePattern -> te*_*le    +
     * <p>
     * Comment for CASE #3
     * There are two negative cases: file name "MIDDLE_IN_THE_END_st_fi.txt" and "st_fi_MIDDLE_IN_THE_START.txt".
     * These two files must never be selected.
     */

    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*st_fi*", "src/homework_13/Ani_Kovalenko/search/Files");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName() + " --> " + file.getParentFile().getName());
            }
        }
    }
}
