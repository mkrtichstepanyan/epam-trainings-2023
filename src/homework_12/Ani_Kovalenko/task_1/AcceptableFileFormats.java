package homework_12.Ani_Kovalenko.task_1;

public enum AcceptableFileFormats {

    TXT(".txt"), CSV(".csv"), JSON(".json");

    String fileFormat;

    AcceptableFileFormats(String fileFormat) {
        this.fileFormat = fileFormat;
    }


    public String getFileFormat() {
        return fileFormat;
    }

}
