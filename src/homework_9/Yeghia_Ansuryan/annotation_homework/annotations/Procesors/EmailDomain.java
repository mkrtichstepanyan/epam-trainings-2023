package homework_9.Yeghia_Ansuryan.annotation_homework.annotations.Procesors;

public enum EmailDomain {
    GMAIL("@gmail.com"), YAHOO("@yahoo.com"), MAIL_RU("@mail.ru");

    private String domConstant;

    EmailDomain(String domain) {
        this.domConstant = domain;
    }

    public String getDomConstant() {
        return domConstant;
    }
}
