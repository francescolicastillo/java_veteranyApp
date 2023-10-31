package main.java.application.logic;

public class Owner {
    private int idOwner;
    private String name;
    private String phone;

    public Owner() {
    }

    public Owner(int idOwner, String name, String phone) {
        this.idOwner = idOwner;
        this.name = name;
        this.phone = phone;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
