package zszms.drink;

import lombok.Data;

@Data
public abstract class Drink {
    private float price;
    private String desc;
    public abstract float cost();
}
