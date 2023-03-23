package homework_13.gohar_hakobyan.notepad;

public enum LanguageType {
    AM("hy"),
    EN("en"),
    RU("ru");

    private String label;

    LanguageType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
