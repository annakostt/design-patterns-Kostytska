package task3_2;

import java.util.ArrayList;

public abstract class Drink {
    protected double drinkPrice = 0;
    protected int volume; //1 - найменший, 3 - найбільший
    protected ArrayList<Double> ingredientsPrice = new ArrayList<>();
    protected String drinkName;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public double getDrinkPrice(){
        return drinkPrice;
    }

    public void setDrinkPrice() {
        this.drinkPrice = getIngredientsPrice() * 1.8 + 3;
    }

    public int getIngredientsPrice() {
        int sum = 0;
        for(Double ingredient_price : ingredientsPrice){
            sum += ingredient_price;
        }
        return sum * volume;
    }

    public String getDrinkName() {
        return drinkName;
    }
}