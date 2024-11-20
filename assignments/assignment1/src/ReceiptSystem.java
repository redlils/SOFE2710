import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReceiptSystem {

    private final static List<Receipt> receipts = new ArrayList<>();
    private final static List<Customer> customers = new ArrayList<>();
    private final static List<Store> stores = new ArrayList<>();
    private final static List<Item> items = new ArrayList<>();

    /**
     * Main entrance function<br/>
     * I mean it's {@code public static void main(String[] args)}, it doesn't get much more iconic
     * @param args List of arguments passed by the executing program
     * @author Lily Redpath
     */
    public static void main(String[] args) {
        ConsoleInterface.initializeScanner();
        boolean escape = false;

        while (!escape) {
            int choice = ConsoleInterface.presentMenu("Thank you for using Lily's Receipt Manager! Please select an option from the following list:",
                    "Manage Receipts",
                    "Generate Reports",
                    "Exit");
            switch (choice) {
                case 0:
                    manageReceipts(); // Move the logic outside the switch to maintain readability
                    ConsoleInterface.teardownScanner();
                    break;
                case 1:
                    beginGenerateReports(); // Move the logic outside the switch to maintain readability
                    break;
                case 2:
                    escape = true;
                    break;
                default:
                    break;
            }
        }

        ConsoleInterface.teardownScanner();
    }

    private static void manageReceipts() {
        int choice = ConsoleInterface.presentMenu("What would you like to do?",
                "Add new receipt",
                "View receipts",
                "Return");
        switch (choice) {
            case 0:
                // TODO: Add a new receipt
                break;
            case 1:

                int filterChoice = ConsoleInterface.presentMenu("Please select a filter:",
                        "Filter by Customer",
                        "Filter by Item",
                        "Filter by Store",
                        "Return");
                switch (filterChoice) {
                    case 0:
                        int customerChoice = ConsoleInterface.presentMenu("Please select a customer to filter by, or enter '2' to manually search:",
                                Stream.concat(Stream.of("Return", "Manually Search"), customers.stream().map(Customer::name)).toList());
                        break;
                    case 1:
                        int itemChoice = ConsoleInterface.presentMenu("Please select an item to filter by, or enter '2' to manually search:",
                                Stream.concat(Stream.of("Return", "Manually Search"), items.stream().map(Item::name)).toList());
                        break;
                    case 2:
                        int storeChoice = ConsoleInterface.presentMenu("Please select a store to filter by, or enter '2' to manually search:",
                                Stream.concat(Stream.of("Return", "Manually Search"), stores.stream().map(Store::name)).toList());
                        break;
                    case 3:
                        // TODO: Return
                        break;
                }
                break;
            case 2:
                // TODO: Return
                return;
        }
    }

    private static void beginGenerateReports() {

    }

    //<editor-fold desc="Required Helper Methods">
//    private static Customer findCustomerByName(ArrayList<Customer> customers, String name) {
//
//    }
//
//    private static Store findStoreByName(ArrayList<Store>, String name) {
//
//    }
    //</editor-fold>
}
