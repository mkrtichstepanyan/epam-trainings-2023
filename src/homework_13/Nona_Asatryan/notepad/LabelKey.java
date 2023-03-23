package homework_13.Nona_Asatryan.notepad;

public enum LabelKey {
    HY("hy"),
    EN("en"),
    RU("ru");

    private String label;

    LabelKey(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
