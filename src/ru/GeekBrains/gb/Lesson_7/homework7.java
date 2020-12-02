package ru.GeekBrains.gb.Lesson_7;


import java.util.Scanner;

public class homework7 {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Markiz", 4),
                new Cat("Murzik", 7),
        };

        Plate plate = new Plate(15);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);

        addFood(plate);

        System.out.println("Added food: ");
        plate.info();
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);


    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new food count: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("--- Info ---");
        plate.info();
        printInfo(cats);
        System.out.println("------");
        System.out.println();
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Did Cat '%s' eat? Answer: %s%n", cat.getName(), result);
        }
        System.out.println();
    }

    private static void printInfo(Cat... cats) {
        for (Cat cat : cats) {
            System.out.printf("Is cat '%s(appetite: %d)' hungry? Answer: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isSatiety());
        }
    }
}
