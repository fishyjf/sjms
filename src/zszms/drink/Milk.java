package zszms.drink;

public class Milk extends Decorator {
    public Milk(Drink drink){
        super.setPrice(1f);
        super.setDrink(drink);
        super.setDesc(drink.getDesc() + super.getDesc());
        super.setPrice(drink.getPrice() + super.getPrice());
    }
}
