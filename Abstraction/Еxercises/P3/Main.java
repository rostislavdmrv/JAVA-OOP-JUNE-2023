package Abstraction.Еxercises.P3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String card = scanner.nextLine();
        String suit = scanner.nextLine();

        CardRanks cardRank = CardRanks.valueOf(card);
        CardSuit cardSuit = CardSuit.valueOf(suit);

        int power = cardRank.getPower() + cardSuit.getPower();



        System.out.printf("Card name: %s of %s; Card power: %d",
                cardRank,
                cardSuit,
                power
        );


    }

}
