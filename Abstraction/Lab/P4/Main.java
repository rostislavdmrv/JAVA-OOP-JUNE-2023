package Abstraction.Lab.P4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        double price = Double.parseDouble(tokens[0]);
        int day = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2]);
        DiscountType discountType = DiscountType.valueOf(tokens[3]);

        PriceCalculator priceCalculator = new PriceCalculator(price,day,season,discountType);
        double calculate = priceCalculator.Calculate();
        System.out.printf("%.2f%n", calculate);
    }
}
