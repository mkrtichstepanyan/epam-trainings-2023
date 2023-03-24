package homework_10.Radik_Manasyan.imitationPersonRegister.models;

import homework_10.Radik_Manasyan.imitationPersonRegister.myExceptions.IncorrectEmail;
import homework_10.Radik_Manasyan.imitationPersonRegister.myExceptions.IncorrectPhoneNumber;
import homework_10.Radik_Manasyan.imitationPersonRegister.myExceptions.NameSurNameException;

public class Person {
    private String name;
    private String surName;
    private String phoneNumber;
    private String email;


    public Person() {
    }

    public void setName(String value){
        if (value.length() > 4 && value.length() < 15){
            this.name = value;
        }else {
            throw new NameSurNameException();
        }
    }

    public void setSurName(String value){
        if (value.length() > 4 && value.length() < 15){
            this.surName = value;
        }else {
            throw new NameSurNameException();
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("(\\+)(374)(\\-)(\\d\\d)(\\-)(\\d\\d)(\\-)(\\d\\d)(\\-)(\\d\\d)")){
            this.phoneNumber = phoneNumber;
        }else throw  new IncorrectPhoneNumber();
    }

    public void setEmail(String email) {
        if (email.matches("([A-Z].+)(@)([a-z].+)(\\.)(ru|com)")){
            this.email = email;
        }else throw new IncorrectEmail();

    }

}
