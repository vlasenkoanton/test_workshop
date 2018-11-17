package test.workshop.conditionalmess;

public class BuisnessLogic {

    private final RateProvider rateProvider;
    private final Representer representer;

    public BuisnessLogic(RateProvider rateProvider, Representer representer) {
        this.rateProvider = rateProvider;
        this.representer = representer;
    }

    public void getRate(String type, int sum, int age) {
        double rate = rateProvider.getRate(type, sum, age);
        representer.showRate(rate);
    }
}
