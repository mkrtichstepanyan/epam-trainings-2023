package homework_13.Alina_Mkhoyan.search;

import java.io.File;

public class FileSearcher {

    private static int index = 0;

    public static File[] searchFiles(String fileNamePattern, String directory) {
        if (fileNamePattern == null || fileNamePattern.equals("")) {
            System.out.println("fileNamePattern can not be null or empty");
            return new File[0];
        }

        if (directory == null || directory.equals("")) {
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
     * Arthur Conan Doil
     * <p>
     * fileNamePattern -> Arthur*
     * fileNamePattern -> *Conan Doel
     * fileNamePattern -> *Conan*
     * fileNamePattern -> Arthur*Doel
     */

    private static boolean matchesPattern(String fileNamePattern, String fileName) {
        if (!fileNamePattern.contains("*")) {
            return fileNamePattern.equals(fileName);
        } else if (fileNamePattern.indexOf("*") == fileNamePattern.lastIndexOf("*")) {
            int starIndex = fileNamePattern.indexOf("*");
            String prefix = fileNamePattern.substring(0, starIndex);
            String suffix = fileNamePattern.substring(starIndex + 1);
            return fileName.startsWith(prefix) && fileName.endsWith(suffix);
        } else {
            String[] parts = fileNamePattern.split("\\*");
            int lastIndex = parts.length - 1;
            int index = fileName.indexOf(parts[0]);
            if (index == -1)
                return false;
            for (int i = 1; i <= lastIndex; i++) {
                int prevIndex = index + parts[i - 1].length();
                index = fileName.indexOf(parts[i], prevIndex);
                if (index == -1)
                    return false;
            }
            return true;
        }
    }
}
