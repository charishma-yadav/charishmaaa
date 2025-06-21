import java.util.*;

public class FinancialForecastingExample {
    // Simple linear regression: y = a + bx
    public static void main(String[] args) {
        // Example: months vs. sales
        double[] months = {1, 2, 3, 4, 5, 6};
        double[] sales = {200, 220, 245, 260, 300, 320};

        int n = months.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumXX = 0;
        for (int i = 0; i < n; i++) {
            sumX += months[i];
            sumY += sales[i];
            sumXY += months[i] * sales[i];
            sumXX += months[i] * months[i];
        }

        // Calculate coefficients a and b for y = a + bx
        double b = (n * sumXY - sumX * sumY) / (n * sumXX - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        System.out.printf("Regression equation: sales = %.2f + %.2f * month%n", a, b);

        // Forecast sales for month 7
        double nextMonth = 7;
        double forecast = a + b * nextMonth;
        System.out.printf("Forecast sales for month %.0f: %.2f%n", nextMonth, forecast);
    }
}