package task3_2;

public class Cacao extends Drink{
    double cacaoPrice = 24;
    double milkPrice = 32;

    public Cacao(int volume) {
        super(volume);
        this.ingredientsPrice.add(cacaoPrice);
        this.ingredientsPrice.add(milkPrice);
        setDrinkPrice();
        this.drinkName = "Cacao";

    }
}
