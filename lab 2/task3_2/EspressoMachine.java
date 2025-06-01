package task3_2;

public class EspressoMachine implements DrinkMachine{
    @Override
    public Drink makeDrink(int volume) {
        return new Espresso(volume);
    }
}