package homework_9.Ani_Kovalenko.Annotation_Homework.annotations.procesors;

public enum EmailDomain {
    GMAIL("@gmail.com"), YAHOO("@yahoo.com"), MAIL_RU("@mail.ru"), HOTMAIL("@hotmail.com");
    private String domConstant;

    EmailDomain(String domain) {
        this.domConstant = domain;
    }

    public String getDomConstant() {
        return domConstant;
    }
}
