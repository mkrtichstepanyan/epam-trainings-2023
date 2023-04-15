package homework_13.Radik_Manasyan.search;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FileSearcher {

    public static List searchFiles(String fileNamePattern, String directory) {
        List<File> result = new LinkedList<>();

        if (fileNamePattern == null || fileNamePattern.equals("")) {
            System.out.println("fileNamePattern can not be null or empty");
        }

        if (directory == null || directory.equals("")) {
            System.out.println("directory name can not be null or empty");
        }

        File currentDirectory = new File(directory);

        searchRecursively(currentDirectory, fileNamePattern, result);

        return result;
    }

    private static void searchRecursively(File currentDirectory, String fileNamePattern, List result) {
        if (currentDirectory.isDirectory()) {
            File[] files = currentDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchRecursively(file, fileNamePattern, result);
                    } else if (matchesPattern(fileNamePattern, file.getName())) {

                        result.add(file);
                    }
                }
            }
        }
    }

    private static boolean matchesPattern(String fileNamePattern, String fileName) {
        if (!fileNamePattern.contains("*")) {
            return fileNamePattern.equals(fileName);
        } else {
            int firstStarIndex = fileNamePattern.indexOf("*");
            int secondStarIndex = fileNamePattern.lastIndexOf("*");
            String prefix = fileNamePattern.substring(0, firstStarIndex);
            String suffix = fileNamePattern.substring(firstStarIndex + 1).trim();
            if (firstStarIndex != secondStarIndex) {
                String between = fileNamePattern.substring(1, fileNamePattern.length() - 1);
                if (fileName.contains(between)) {
                    if (fileName.indexOf(between) > 0) {
                        return true;
                    }
                }
            }
            return fileName.startsWith(prefix) && fileName.endsWith(suffix);
        }
    }
}
