package pizza_calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        //обработка на първи ред
        String line = scanner.nextLine();
        String[] pizzaData = line.split("\\s+");
        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);// защото е масив от стринг  и да сане инт
        Pizza pizza = new Pizza(pizzaName, numberOfToppings);

        //обработка на втори ред
        String doughInput = scanner.nextLine();
        String[] doughTokens = doughInput.split("\\s+");
        String flourType = doughTokens[1];
        String bakingTechnique = doughTokens[2];
        int weightInGrams = Integer.parseInt(doughTokens[3]);
        Dough dough = new Dough(flourType,bakingTechnique,weightInGrams);

        pizza.setDough(dough);

        String toppingInput = scanner.nextLine();

        while (!toppingInput.equals("END")) {
            String[] toppingTokens = toppingInput.split("\\s+");
            String toppingType = toppingTokens[1];
            int toppingWeight = Integer.parseInt(toppingTokens[2]);
            Topping topping = new Topping(toppingType,toppingWeight);
            pizza.addTopping(topping);

            toppingInput = scanner.nextLine();
        }
        System.out.printf("%s - %.2f\n", pizza.getName(), pizza.getOverallCalories());
    }
}
