package task3_2;
public class AmericanoMachine implements DrinkMachine{
    @Override
    public Drink makeDrink(int volume) {
        return new Americano(volume);
    }
}