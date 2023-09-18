package design_pattern_practice;

public class MinusDiscount extends IDiscountStrategy {
    public MinusDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value - discount;
    }
}
