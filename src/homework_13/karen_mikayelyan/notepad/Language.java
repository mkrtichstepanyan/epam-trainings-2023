package homework_13.karen_mikayelyan.notepad;

public enum Language {
    AM("hy"),
    RU("ru"),
    EN("en");

    private String name;

    Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
