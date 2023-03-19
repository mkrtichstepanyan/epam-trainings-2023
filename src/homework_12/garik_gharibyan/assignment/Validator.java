package homework_12.garik_gharibyan.assignment;
public class Validator {

    private static final String[] extensions = new String[]{
            "txt", "json", "csv"
    };

    public static boolean isValidFileName(String fileName) {
        for (String extension : extensions) {
            if (fileName.endsWith("." + extension)) {
                return true;
            }
        }
        return false;
    }
}