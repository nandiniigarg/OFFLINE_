package com.deskmate.models;

public class Users {

    String displayPicture, userName, eMail, password, Occupation, lastMessage, school;

    public Users(String displayPicture, String userName, String eMail, String password, String Occupation, String lastMessage, String school) {
        this.displayPicture = displayPicture;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.Occupation = Occupation;
        this.lastMessage = lastMessage;
        this.school = school;
    }


    //Sign up constructor
    public Users(String userName, String eMail, String password, String Occupation, String lastMessage, String school) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.Occupation = Occupation;
        this.lastMessage = lastMessage;
        this.school = school;
    }


    //created user's database off to firebase
    public Users(String userName, String eMail, String password, String Occupation, String school) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.Occupation = Occupation;
        this.school = school;
    }

    public void setDisplayPicture(String displayPicture) {
        this.displayPicture = displayPicture;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOccupation(String occupation) {
        this.Occupation = occupation;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getDisplayPicture() {
        return displayPicture;
    }

    public String getUserName() {
        return userName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
