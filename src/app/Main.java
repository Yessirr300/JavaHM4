package app;

public class Main {

    public static void main(String[] args) {
        String product1Name = "smartphone";
        int product1Days = 5;
        double product1Price = 2430.68;
        int product1Quantity = 5;

        String product2Name = "laptop";
        int product2Days = 7;
        double product2Price = 1498.12;
        int product2Quantity = 7;

        double product1TotalSales = calculateTotalSales(product1Quantity, product1Price);
        double product1SalesPerDay = calculateSalesPerDay(product1TotalSales, product1Days);

        double product2TotalSales = calculateTotalSales(product2Quantity, product2Price);
        double product2SalesPerDay = calculateSalesPerDay(product2TotalSales, product2Days);

        System.out.printf("Product No 1: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                product1Name, product1Days, product1TotalSales, product1SalesPerDay);

        System.out.printf("Product No 2: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                product2Name, product2Days, product2TotalSales, product2SalesPerDay);
    }

    private static double calculateTotalSales(int quantity, double price) {
        return quantity * price;
    }

    private static double calculateSalesPerDay(double totalSales, int days) {
        return totalSales / days;
    }
}
