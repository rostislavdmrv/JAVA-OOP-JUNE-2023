package Abstraction.Lab.P1;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rSize = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rSize; i++) {
            printRow(i,rSize-i);

        }
        for (int i = rSize-1; i > 0; i--) {
            printRow(i,rSize-i);

        }
    }
    public  static  void  printRow(int countStars,int countOfSpace)
    {
        for (int i = 0; i < countOfSpace; i++) {
            System.out.print(" ");

        }
        for (int i = 0; i < countStars; i++) {
            System.out.print("* ");

        }
        System.out.println();

    }
}
