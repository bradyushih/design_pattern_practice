package design_pattern_practice;

/**
  *
  * @project design_pattern
  * @author Brad Shih on 2023/9/18
  */
public abstract class IDiscountStrategy{
    double discount;
    private IDiscountStrategy(){}
    public IDiscountStrategy(double discount){
        this.discount = discount;
    }
    abstract public double getValue(double value);
}

