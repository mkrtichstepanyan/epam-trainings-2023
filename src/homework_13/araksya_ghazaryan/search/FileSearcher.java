package homework_13.araksya_ghazaryan.search;

import java.io.File;

public class FileSearcher {

    private static int index = 0;

    public static File[] searchFiles(String fileNamePattern, String directory) {
        if (fileNamePattern == null || fileNamePattern.equals("")){
            System.out.println("fileNamePattern can not be null or empty");
            return new File[0];
        }

        if (directory == null || directory.equals("")){
            System.out.println("directory name can not be null or empty");
            return new File[0];
        }

        File[] result = new File[1000]; //TODO: update when learn collections
        File currentDirectory = new File(directory);
        searchRecursively(currentDirectory, fileNamePattern, result);

        return result;
    }

    private static void searchRecursively(File currentDirectory, String fileNamePattern, File[] result) {
        if (currentDirectory.isDirectory()) {
            File[] files = currentDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchRecursively(file, fileNamePattern, result);
                    } else if (matchesPattern(fileNamePattern, file.getName())) {
                        result[index++] = file;
                    }
                }
            }
        }
    }

    /**
     * Arthur Conan Doel
     * <p>
     * fileNamePattern -> Arthur*
     * fileNamePattern -> *Conan Doel
     * fileNamePattern -> *Conan*
     * fileNamePattern -> Arthur*Doel
     */
    private static boolean matchesPattern(String fileNamePattern, String fileName) {
        if (!fileNamePattern.contains("*")) {
            return fileNamePattern.equals(fileName);
        } else {
            String[] parts = fileNamePattern.split("\\*");
            if (parts.length == 0) {
                return true;
            }
            int startIndex = 0;
            for (String part : parts) {
                int index = fileName.indexOf(part, startIndex);
                if (index == -1) {
                    return false;
                }
                startIndex = index + part.length();
            }
            return true;
        }
    }
}