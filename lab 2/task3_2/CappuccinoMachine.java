package task3_2;
public class CappuccinoMachine implements DrinkMachine{
    @Override
    public Drink makeDrink(int volume) {
        return new Cappuccino(volume);
    }
}