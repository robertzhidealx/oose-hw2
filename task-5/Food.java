package main.model;

// Represents food.
public class Food {
    public static final int DECAY_AMOUNT = 10;
    public static final int INITIAL_NUTRITIONAL_VALUE = 100;

    private Cell position;
    private int nutritionalValue;
    

    // food has INITIAL_NUTRITIONAL_VALUE and is located at given cell
    public Food(Cell position) {
        this.position = position;
        nutritionalValue = INITIAL_NUTRITIONAL_VALUE;
    }

    // food has given nutritional value and is located at given cell
    public Food(Cell position, int nutritionalValue) {
        this.position = position;
        this.nutritionalValue = nutritionalValue;
    }

    public Cell getPosition() {
        return position;
    }

    // reduces nutritional value of food by DECAY_AMOUNT -
    //   nutritional value not reduced below zero
    public void decay() {
        nutritionalValue = nutritionalValue - DECAY_AMOUNT;

        if (nutritionalValue < 0)
            nutritionalValue = 0;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }
}
