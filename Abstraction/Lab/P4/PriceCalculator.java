package Abstraction.Lab.P4;

public class PriceCalculator {
    private double price;
    private int day;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double price, int day, Season season, DiscountType discountType) {
        this.price = price;
        this.day = day;
        this.season = season;
        this.discountType = discountType;
    }

    public double Calculate() {
        return this.price * this.day * this.season.getPriceFactor() * this.discountType.getDiscountFactor();

    }
}
