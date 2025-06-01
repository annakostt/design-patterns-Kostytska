package task3_2;
public class Cappuccino extends Drink {
    double coffeeBeansPrice = 45;
    double milkPrice = 25;
    double sugarPrice = 12;

    public Cappuccino(int volume) {

        super(volume);
        this.ingredientsPrice.add(coffeeBeansPrice);
        this.ingredientsPrice.add(milkPrice);
        this.ingredientsPrice.add(sugarPrice);
        setDrinkPrice();
        this.drinkName = "Capuccino";
    }
}