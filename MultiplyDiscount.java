package design_pattern_practice;

public class MultiplyDiscount extends IDiscountStrategy {
    public MultiplyDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value * discount;
    }
}
