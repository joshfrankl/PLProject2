package frankl.customer;

public class Customer extends Person {
    private String customerNumber;

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public Customer() {}

    public String getDisplayText() {
        return super.toString() + "\nCustomer number: " + customerNumber;
    }
}
