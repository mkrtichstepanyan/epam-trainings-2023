package homework_13.Yeghia_Ansuryan.notepad;

public enum LanguagesType {

    HY("hy"), RU("ru"), EN("en"), DU("du");

    private String label;

    LanguagesType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
