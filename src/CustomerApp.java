import java.util.ArrayList;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ArrayList stores references to Customer objects
        ArrayList<Customer> customers = new ArrayList<>();

        System.out.println("Customer Information Program");
        System.out.println("----------------------------");

        // Get information for two customers
        for (int i = 1; i <= 2; i++) {

            System.out.println("\nEnter information for Customer " + i);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            Customer customer = new Customer(name, email, phone);

            customers.add(customer);
        }

        // Display all customers
        System.out.println("\nStored Customer Information");
        System.out.println("---------------------------");

        for (Customer customer : customers) {
            System.out.println(customer);
        }

        scanner.close();
    }
}