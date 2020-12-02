package ru.GeekBrains.gb.Lesson_7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean eat(Plate plate) {
        String validateMessage = checkEat(plate);
        if (validateMessage != null) {
            System.out.println(validateMessage);
            return false;
        }

        doEat(plate);
        satiety = true;
        return true;
    }

    private String checkEat(Plate plate) {
        if ( !plate.isFoodEnough(appetite) ) {
            return "Food is not enough in the plate!";
        }
        if (satiety) {
            return "Cat is already satiety!";
        }

        return null;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean isSatiety() {
        return satiety;
    }
}
