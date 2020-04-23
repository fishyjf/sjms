package zszms.drink;

import lombok.Data;

@Data
public class Coffee extends Drink {
    public float cost() {
        return super.getPrice();
    }
}
