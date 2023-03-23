package homework_13.Ani_Kovalenko.search;

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


    private static boolean matchesPattern(String fileNamePattern, String fileName) {
        String name = fileName.substring(0, fileName.indexOf('.'));
        if (!fileNamePattern.contains("*")) {
            return fileNamePattern.equals(name);
        } else {
            int starIndex = fileNamePattern.indexOf("*");
            String prefix = fileNamePattern.substring(0, starIndex);
            String suffix = fileNamePattern.substring(starIndex + 1);
            if (!suffix.contains("*")) {
                return name.startsWith(prefix) && name.endsWith(suffix);
            } else {
                return ifIncludesTwoStars(suffix, prefix, fileNamePattern, name);
            }
        }
    }

    private static boolean ifIncludesTwoStars(String suffix, String prefix, String fileNamePattern, String name) {
        int secondStarIndex = suffix.indexOf("*");
        String middleSection = suffix.substring(0, secondStarIndex);
        String endSection = suffix.substring(secondStarIndex + 1);
        if (!fileNamePattern.startsWith("*") && fileNamePattern.endsWith("*")) {
            return name.startsWith(prefix) && name.contains(middleSection);
        } else if (fileNamePattern.startsWith("*") && !fileNamePattern.endsWith("*")) {
            return name.contains(middleSection) && name.endsWith(endSection);
        } else if (!fileNamePattern.startsWith("*") && !fileNamePattern.endsWith("*")) {
            return name.startsWith(prefix) && name.contains(middleSection) && name.endsWith(endSection);
        } else if (fileNamePattern.startsWith("*") && fileNamePattern.endsWith("*")) {
            if (!name.startsWith(middleSection) && !name.endsWith(middleSection)) {
                return name.contains(middleSection);
            }
        }
        return false;
    }
}
