package homework_7.Sofya_Ghazaryan.Pizza.model;

public class User {

    private static final int BASE_USER_NUMBER = 1000;
    private static int initialID = BASE_USER_NUMBER;
    private int userNumber;
    private String userName;
    private String phoneNumber;

    public User() {
        userNumber = initialID++;
    }


    public int getUserNumber() {
        return userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
