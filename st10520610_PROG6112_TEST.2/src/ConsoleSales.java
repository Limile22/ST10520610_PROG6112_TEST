public class ConsoleSales extends Consoles {

    // Constructor inheriting from abstract class[cite: 3]
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the report as requested in the sample output[cite: 3, 4]
    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("**************************************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}