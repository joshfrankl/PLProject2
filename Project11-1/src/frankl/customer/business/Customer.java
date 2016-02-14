package frankl.customer;

public class Customer extends Person {
    private String customerNumber;

    public Customer() {}

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getDisplayText() {
        return super.toString() + "\nCustomer number: " + customerNumber;
    }
}
