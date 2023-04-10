package classwork.enumexample;

// enumeration
public enum Seasons implements EnumInterface {
    AUTUMN("Autumn", false),
    SUMMER("Summer", true), WINTER("Winter", false), SPRING("Spring", false);

    private final String prettyName;
    private final boolean isHot;

    Seasons(String prettyName, boolean isHot) {
        this.prettyName = prettyName;
        this.isHot = isHot;
    }

    public boolean isHot() {
        return isHot;
    }



    @Override
    public String getPrettyName() {
        return prettyName;
    }
}
