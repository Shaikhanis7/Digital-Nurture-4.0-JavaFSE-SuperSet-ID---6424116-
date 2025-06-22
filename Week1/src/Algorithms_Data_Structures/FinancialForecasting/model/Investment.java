package Algorithms_Data_Structures.FinancialForecasting.model;

public class Investment {
    private double initialAmount;
    private double annualGrowthRate;

    public Investment(double initialAmount, double annualGrowthRate) {
        this.initialAmount = initialAmount;
        this.annualGrowthRate = annualGrowthRate;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public double getAnnualGrowthRate() {
        return annualGrowthRate;
    }

    @Override
    public String toString() {
        return String.format("Investment [Initial Amount: %.2f, Annual Growth Rate: %.2f%%]",
                initialAmount, annualGrowthRate * 100);
    }
}
