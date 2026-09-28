import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Following the prompt's exact sample display layout[cite: 4]
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "UNKNOWN";
        }

        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = scanner.nextInt();

        // Instantiate the ConsoleSales subclass[cite: 3]
        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        System.out.println();
        salesReport.printReport();

        scanner.close();
    }
}