package zszms.drink;

import lombok.Data;

@Data
public class Decorator extends Drink {
    private Drink drink;
    public float cost() {
        return super.getPrice() + drink.getPrice();
    }
}
