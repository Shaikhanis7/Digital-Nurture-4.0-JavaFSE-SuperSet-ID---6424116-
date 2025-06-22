package Algorithms_Data_Structures.FinancialForecasting.service;

import Algorithms_Data_Structures.FinancialForecasting.model.Investment;

public class ForecastService {

    // Recursive method
    public double calculateFutureValueRecursive(Investment investment, int years) {
        if (years == 0) {
            return investment.getInitialAmount();
        }
        return calculateFutureValueRecursive(investment, years - 1) * (1 + investment.getAnnualGrowthRate());
    }


    public double calculateFutureValueIterative(Investment investment, int years) {
        double futureValue = investment.getInitialAmount();
        for (int i = 1; i <= years; i++) {
            futureValue *= (1 + investment.getAnnualGrowthRate());
        }
        return futureValue;
    }
}