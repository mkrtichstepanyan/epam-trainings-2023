package homework_11.anna_manukyan.assignment_1.enums;

public enum Format {
    TXT(".txt"),
    CSV(".csv"),
    JSON(".json");

    private String extension;

    Format(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
