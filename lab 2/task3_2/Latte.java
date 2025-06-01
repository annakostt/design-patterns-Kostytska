package task3_2;


public class Latte extends Drink {
    double coffeeBeansPrice = 44;
    double milkPrice = 24;

    public Latte(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeeBeansPrice);
        this.ingredientsPrice.add(milkPrice);
        setDrinkPrice();
        this.drinkName = "Latte";

    }
}
