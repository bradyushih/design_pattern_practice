package design_pattern_practice;

/**
 * @author Brad Shih on 2023/9/18
 * @project design_pattern
 */
public abstract class Drink {

    IDiscountStrategy discountStrategy = new NoneDiscount(1);

    double value;

    private Drink(){}

    public Drink(double value) {
        this.value = value;
    }

    public Drink(double value , IDiscountStrategy discountStrategy) {
        this.value = value;
        this.discountStrategy = discountStrategy;
    }

    public double getValue() {
        return discountStrategy.getValue(value);
    }

}

