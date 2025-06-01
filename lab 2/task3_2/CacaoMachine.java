package task3_2;

public class CacaoMachine implements DrinkMachine{
    @Override
    public Drink makeDrink(int volume) {
        return new Cacao(volume);
    }
}
