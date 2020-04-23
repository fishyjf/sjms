package zszms.drink;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink drink = new Milk(new Soy(new Espresso()));
        System.out.println(drink.getDesc());
    }
}
