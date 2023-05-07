package homework_13.Argishti_Mesropyan.fileSearcher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {
    private final String rootPath;

    public FileSearcher(String rootPath) {
        this.rootPath = rootPath;
    }

    public List<String> search(String fileNamePattern) {
        List<String> matches = new ArrayList<>();
        File root = new File(rootPath);
        if (!root.isDirectory()) {
            return matches;
        }
        searchRecursive(root, fileNamePattern, matches);

        if (fileNamePattern.contains("**")) {
            String[] patternParts = fileNamePattern.split("\\*\\*");
            if (patternParts.length == 2) {
                List<String> filteredMatches = new ArrayList<>();
                String firstPattern = patternParts[0];
                String secondPattern = patternParts[1];
                for (String match : matches) {
                    if (match.contains(firstPattern) && match.contains(secondPattern)) {
                        filteredMatches.add(match);
                    }
                }
                return filteredMatches;
            }
        }
        return matches;
    }

    private void searchRecursive(File currentDir, String fileNamePattern, List<String> matches) {
        File[] files = currentDir.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                searchRecursive(file, fileNamePattern, matches);
            } else if (file.isFile()) {
                if (matchesPattern(file.getName(), fileNamePattern)) {
                    matches.add(file.getAbsolutePath());
                }
            }
        }
    }

    private boolean matchesPattern(String fileName, String fileNamePattern) {
        return fileName.matches(fileNamePattern.replace(".", "\\.").replace("*", ".*"));
    }
}
