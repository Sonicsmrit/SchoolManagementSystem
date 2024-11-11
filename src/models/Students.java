package models;

public class Students extends People {

    public String Name;
    public String Surname;
    public String PersonalDetails;

    public Students(int IDs, int age, String address, String name, String surname, String personalDetails) {
        super(IDs, age, address);
        Name = name;
        Surname = surname;
        PersonalDetails = personalDetails;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPersonalDetails() {
        return PersonalDetails;
    }

    public void setPersonalDetails(String personalDetails) {
        PersonalDetails = personalDetails;
    }
}
