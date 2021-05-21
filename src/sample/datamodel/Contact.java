package sample.datamodel;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
    private SimpleStringProperty firstName = new SimpleStringProperty("");
    private SimpleStringProperty lastName = new SimpleStringProperty("");
    private SimpleStringProperty phoneNumber = new SimpleStringProperty("");
    private SimpleStringProperty notes = new SimpleStringProperty("");

    public Contact(){

    }

    public Contact(String firstName, String lastName, String phoneNumber, String notes){
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.phoneNumber.set(phoneNumber);
        this.notes.set(notes);
    }

    //getter
    public String getFirstName() {
        return firstName.get();
    }

    //getter
    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    //setter
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    //getter
    public String getLastName() {
        return lastName.get();
    }

    //getter
    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    //setter
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    //getter
    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    //getter
    public SimpleStringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    //setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }
    //getter
    public String getNotes() {
        return notes.get();
    }

    //getter
    public SimpleStringProperty notesProperty() {
        return notes;
    }

    //setter
    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", phoneNumber=" + phoneNumber +
                ", notes=" + notes +
                '}';
    }
}
