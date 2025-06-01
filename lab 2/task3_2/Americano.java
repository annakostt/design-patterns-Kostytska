package task3_2;
public class Americano extends Drink {
    double coffeBeansPrice = 50;
    double sugarPrice = 16;
    public Americano(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeBeansPrice);
        this.ingredientsPrice.add(sugarPrice);
        setDrinkPrice();
        this.drinkName = "Americano";
    }
}