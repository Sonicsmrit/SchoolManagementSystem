package models;

public class People {
    public int IDs;
    public int age;
    public String address;

    public People(int IDs, int age, String address) {
        this.IDs = IDs;
        this.age = age;
        this.address = address;

    }

    public int getIDs() {
        return IDs;
    }

    public void setIDs(int IDs) {
        this.IDs = IDs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
