package data;

import java.util.ArrayList;

public class Provider {
    private String ID;
    private String name;
    private String phoneNum;
    private String mail;
    private ArrayList<Product> products;

    public Provider(String ID, String name, String phoneNum, String mail) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.mail = mail;
        products = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
