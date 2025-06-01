package task3_2;

public class LatteMachine implements DrinkMachine{
    @Override
    public Drink makeDrink(int volume) {
        return new Latte(volume);
    }
}
