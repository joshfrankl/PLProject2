package frankl.customer;

/**
 * Created by Josh Frankl on 2/9/2016.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person() {}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nEmail: " + emailAddress;
    }

    public abstract String getDisplayText();
}
