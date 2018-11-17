package test.workshop.conditionalmess;

public class RateProvider {

    public double getRate(String type, int sum, int age) {
        switch (type) {
            case "Deposit":
                if (sum < 10_000) {
                    return 0.05;
                }
                if (sum < 50_000) {
                    return 0.04;
                }
                return 0.03;
            case "Credit":
                double miltiplier = 1.0;
                if (age > 60) {
                    miltiplier = 1.2;
                }
                if (sum < 20_000) {
                    return miltiplier * 0.15;
                }
                if (sum < 100_000) {
                    return miltiplier * 0.20;
                }
                return miltiplier * 0.25;
            case "Current":
                return 0.0;
            default:
                throw new IllegalArgumentException("Unknown account type");
        }
    }
}
