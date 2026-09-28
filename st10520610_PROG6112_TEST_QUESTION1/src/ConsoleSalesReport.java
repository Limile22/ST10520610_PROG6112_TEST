public class ConsoleSalesReport {
    public static void main(String[] args) {
        // Single-dimensional array for cities[cite: 1]
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Single-dimensional array for console types[cite: 1]
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array for console sales data[cite: 1]
        int[][] sales = {
                {1000, 2000, 3000}, // Cape Town[cite: 1]
                {2000, 3000, 4000}, // Port Elizabeth[cite: 1]
                {1500, 1100, 1200}  // Pretoria[cite: 1]
        };

        // Displaying the main console report[cite: 1]
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "", consoles[0], consoles[1], consoles[2]);

        int[] cityTotals = new int[cities.length];
        int maxSales = -1;
        String topCity = "";

        // Loop through cities and consoles to display data and calculate totals[cite: 1]
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s", cities[i]);
            int currentCityTotal = 0;
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
                currentCityTotal += sales[i][j];
            }
            cityTotals[i] = currentCityTotal;
            System.out.println();
        }

        // Displaying city sales totals[cite: 1]
        System.out.println("\n--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d\n", cities[i], cityTotals[i]);

            // Check for the city with the most sales[cite: 1]
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }

        // Displaying the city with the most sales[cite: 1]
        System.out.println("\n--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
    }
}