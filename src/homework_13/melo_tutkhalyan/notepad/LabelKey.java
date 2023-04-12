package homework_13.melo_tutkhalyan.notepad;

public enum LabelKey {

    HY("hy"),
    RU("ru"),
    EN("en");
    private final String label;
    LabelKey(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

