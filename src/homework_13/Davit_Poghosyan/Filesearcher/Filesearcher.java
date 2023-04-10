package homework_13.Davit_Poghosyan.Filesearcher;

import java.io.File;

public class Filesearcher {
    private static int index = 0;

    public static File[] searchFiles(String filenamePattern, String directory) {
        if (filenamePattern == null || filenamePattern.equals("")) {
            System.out.println("FilenamePatter can't be null");
            return new File[0];
        }
        if (directory == null || directory.equals("")) {
            System.out.println("Directory can't be empty");
            return new File[0];
        }
        File[] resultFiles = new File[1000];
        File currentDirectory = new File(directory);
        searchRecursively(currentDirectory, filenamePattern, resultFiles);
        return resultFiles;
    }

    private static void searchRecursively(File currentDirectory, String filenamePattern, File[] resultFiles) {
        if (currentDirectory.isDirectory()) {
            File[] files = currentDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchRecursively(file, filenamePattern, resultFiles);
                    } else if (matchPattern(filenamePattern, file.getName())) {
                        resultFiles[index++] = file;
                    }
                }
            }
        }
    }

    private static boolean matchPattern(String filenamePattern, String name) {
        if (!filenamePattern.contains("*")) {
            return filenamePattern.equals(name);
        } else {
            int starIndex = filenamePattern.indexOf("*");
            String prefix = filenamePattern.substring(0, starIndex);
            String suffix = filenamePattern.substring(starIndex + 1);
            return name.startsWith(prefix) && name.endsWith(suffix);
        }
    }
}

