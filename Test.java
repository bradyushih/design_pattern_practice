package design_pattern_practice;

/**
 * @author Brad Shih on 2023/9/18
 * @project design_pattern
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.addDrink(new Coffee(165));
        drinkOrder.addDrink(new MilkTea(55,new MinusDiscount(20)));
        drinkOrder.addDrink(new Coffee(120, new MultiplyDiscount(0.5)));
        double price = drinkOrder.getTotalPrice(new NoneDiscount(1));
        //200
        System.out.println(price);
        price = drinkOrder.getTotalPrice(new MultiplyDiscount(0.9));
        //打九折
        System.out.println(price);


    }
}
