package frankl.customer;

public class PersonApp {

    public static void main(String[] args) {
        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        boolean keepRunning = true;
        while (keepRunning == true) {
            String input = Console.getString("Create customer or employee? (c/e): ");
            Console.displayLine();

            if (input.equalsIgnoreCase("c")) {
                String firstName = Console.getString("Enter first name: ");
                String lastName = Console.getString("Enter last name: ");
                String email = Console.getString("Enter email address: ");
                String customerNumber = Console.getString("Customer number: ");

                Customer customer = new Customer();
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setEmailAddress(email);
                customer.setCustomerNumber(customerNumber);

                Console.displayLine();
                print(customer);
            }
            else if (input.equalsIgnoreCase("e")) {
                String firstName = Console.getString("Enter first name: ");
                String lastName = Console.getString("Enter last name: ");
                String email = Console.getString("Enter email address: ");
                String ssn = Console.getString("Social security number: ");

                Employee employee = new Employee();
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmailAddress(email);
                employee.setSSN(ssn);

                Console.displayLine();
                print(employee);
            }

            Console.displayLine();
            String continueInput = Console.getString("Continue? (y/n) ");

            if ( !continueInput.equalsIgnoreCase("y") ) {
                keepRunning = false; // Only keep running if "y" is inputted
            }

        }
    }

    public static void print(Person p) {
        Console.displayLine("You entered:\n" + p.getDisplayText());
    }

}
