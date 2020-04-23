package zszms.drink;

public class Soy extends Decorator {
    public Soy(Drink drink){
        super.setPrice(1.5f);
        super.setDesc(drink.getDesc() + super.getDesc());
        super.setDrink(drink);
        super.setPrice(drink.getPrice() + super.getPrice());
    }
}
