package homework_10.Ani_Kovalenko.Pizza_Exceptions;

public enum CountryCodes {
    ARMENIA("+374"), RUSSIA("+7"), USA("+1");
    String code;

    CountryCodes(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
