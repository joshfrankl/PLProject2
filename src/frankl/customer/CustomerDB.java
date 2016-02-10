package frankl.customer;

public class CustomerDB {

    public static Customer getCustomer(int customerID) {
        if (customerID == 1001) {
            return new Customer("Barbara White", "3400 Richmond Parkway #3423", "Bristol", "CT", "06010");
        }
        else if (customerID == 1002) {
            return new Customer("Karl Vang", "327 Franklin Street", "Edina", "MN", "55435");
        }
        else if (customerID == 1003) {
            return new Customer("Ronda Chavan", "518 Commanche Dr.", "Greensboro", "NC", "27410");
        }
        else if (customerID == 1004) {
            return new Customer("John Smith", "114 Southwestern Dr.", "Austin", "TX", "78701");
        }
        else {
            return null;
        }
    }

}
