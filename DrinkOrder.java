package design_pattern_practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brad Shih on 2023/9/18
 * @project design_pattern
 */
public class DrinkOrder {
    private List<Drink> drinkList = new ArrayList<>();
    public void addDrink(Drink drink){
        drinkList.add(drink);
    }
    public void removeDrink(Drink drink){
        drinkList.remove(drink);
    }
    private double totalPrice(){
        double totalPrice = 0;
        for (Drink drink : drinkList) {
            totalPrice += drink.getValue();
        }
        return totalPrice;
    }
    public double getTotalPrice(IDiscountStrategy discountStrategy){
        double totalPrice = totalPrice();
        return discountStrategy.getValue(totalPrice);
    }
}
