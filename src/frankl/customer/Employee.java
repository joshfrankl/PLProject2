package frankl.customer;

/**
 * Created by Josh Frankl on 2/9/2016.
 */
public class Employee extends Person {
    private String SSN;

    public Employee() {}

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public String getDisplayText() {
        return super.toString() + "\nSocial security number: " + SSN;
    }
}
