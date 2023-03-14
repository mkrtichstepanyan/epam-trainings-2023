package homework_13.garik_gharibyan.search;

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

//        File[] result = new File[2]; //TODO: update when learn collections
        File currentDirectory = new File(directory);
        return searchRecursively(currentDirectory, fileNamePattern);

    }

    private static File[] searchRecursively(File currentDirectory, String fileNamePattern) {
        File[] result = new File[2];

        if (currentDirectory.isDirectory()) {
            File[] files = currentDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchRecursively(file, fileNamePattern);
                    } else if (matchesPattern(fileNamePattern, file.getName())) {
                        if (index == result.length){
                            File[] newResult = extendCapacity(result);
                            newResult[index++] = file;
                            result = newResult;
                        }else {
                            result[index++] = file;
                        }
                    }
                }
            }
        }else if (matchesPattern(fileNamePattern, currentDirectory.getName())){
            if (index == result.length){
                File[] newRes = extendCapacity(result);
                newRes[index++] = currentDirectory;
                result = newRes;
            }else{
                result[index++] = currentDirectory;
            }
        }
        return result;
    }

    /**
     * Arthur Conan Doel
     * <p>
     * fileNamePattern -> Arthur*
     * fileNamePattern -> *Conan Doel
     * fileNamePattern -> *Conan*
     * fileNamePattern -> Art*hur*Doel
     */
    private static boolean matchesPattern(String fileNamePattern, String fileName) {
        if (!fileNamePattern.contains("*")) {
            return fileNamePattern.equals(fileName);
        } else {
            int starIndex = fileNamePattern.indexOf("*");
            String part1 = fileNamePattern.substring(0, starIndex);
            String part2 = fileNamePattern.substring(starIndex + 1);
            if (part2.contains("*")){
                int starIndexPart2 = part2.indexOf("*");
                String part2_1 = part2.substring(0,starIndexPart2);
                String part2_2 = part2.substring(starIndexPart2 + 1);
                return fileName.startsWith(part1) && fileName.contains(part2_1) && fileName.endsWith(part2_2);
            }else {
                return fileName.startsWith(part1) && fileName.endsWith(part2);
            }
        }
    }

    private static File[] extendCapacity(File[] files){
        File[] newFiles = new File[files.length*2];
        for (int i = 0; i < files.length; i++) {
            newFiles[i] = files[i];
        }
        return newFiles;
    }
}
