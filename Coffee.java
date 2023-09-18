package design_pattern_practice;

public class Coffee extends Drink {
    public Coffee(double value) {
        super(value);
    }

    public Coffee(double value, IDiscountStrategy discountStrategy) {
        super(value, discountStrategy);
    }

}
