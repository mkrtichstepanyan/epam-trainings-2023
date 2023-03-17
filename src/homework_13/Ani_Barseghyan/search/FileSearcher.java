package homework_13.Ani_Barseghyan.search;

import java.io.File;

public class FileSearcher {
    private static int index = 0;

    public static File[] searchFiles(String fileNamePattern, String directory) {
        if (fileNamePattern == null || fileNamePattern.equals("")) {
            System.out.println("File Name Pattern can not be empty");
            return new File[0];
        }
        if (directory == null || directory.equals("")) {
            System.out.println("Directory name can not be empty");
            return new File[0];

        }
        File[] result = new File[1000]; //TODO: update when learn collections
        File currentDirectory = new File(directory);
        searchRecursively(currentDirectory, fileNamePattern, result);

        return result;
    }

    private static File[] searchRecursively(File currentDirectory, String fileNamePattern, File[] result) {
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
        return result;
    }

    private static boolean matchesPattern(String fileNamePattern, String fileName) {
        if (!fileNamePattern.contains("*")) {
            return fileNamePattern.equals(fileName);
        } else {
            int starIndexFirst = fileNamePattern.indexOf("*");
            int starIndexLast = fileNamePattern.lastIndexOf("*");
            String prefix = fileNamePattern.substring(0, starIndexFirst);
            String suffix = fileNamePattern.substring(starIndexFirst + 1);
            if (starIndexFirst == starIndexLast) {
                return fileName.startsWith(prefix) && fileName.endsWith(suffix) || fileName.contains(prefix) && fileName.contains(suffix);
            } else {
                String middle = fileNamePattern.substring(starIndexFirst + 1, starIndexLast);
                return fileName.contains(middle);
            }
        }
    }
}
