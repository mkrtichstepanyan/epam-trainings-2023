package homework_9.Karen_Sargsyan.annotation_homework.annotations.procesors;

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
