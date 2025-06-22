package Algorithms_Data_Structures.FinancialForecasting;

import Algorithms_Data_Structures.FinancialForecasting.model.Investment;
import Algorithms_Data_Structures.FinancialForecasting.service.ForecastService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ₹");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (in %): ");
        double annualRatePercent = scanner.nextDouble();
        double annualRate = annualRatePercent / 100.0;

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        Investment investment = new Investment(initialAmount, annualRate);

        ForecastService forecastService = new ForecastService();
        double recursiveValue = forecastService.calculateFutureValueRecursive(investment, years);
        double iterativeValue = forecastService.calculateFutureValueIterative(investment, years);

        System.out.println("\n" + investment);
        System.out.printf("Forecasted Value after %d years:\n", years);
        System.out.printf("🔁 Recursive Method: ₹%.2f\n", recursiveValue);
        System.out.printf("✅ Iterative Method: ₹%.2f\n", iterativeValue);

        scanner.close();
    }
}