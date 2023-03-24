package homework_13.Ani_Kovalenko.notepad;

public enum LanguageType {
    HY("hy"), EN("en"), RU("ru");
    String label;

    LanguageType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
