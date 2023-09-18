package design_pattern_practice;

public class NoneDiscount extends IDiscountStrategy {
    public NoneDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value;
    }
}
