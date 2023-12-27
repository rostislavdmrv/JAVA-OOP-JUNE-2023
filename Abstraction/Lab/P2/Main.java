package Abstraction.Lab.P2;



import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int [] rectanglePointsCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
               .mapToInt(Integer ::parseInt).toArray();


       Point bottomLeft = new Point(rectanglePointsCoordinates[0],rectanglePointsCoordinates[1]);
       Point topRight = new Point(rectanglePointsCoordinates[2],rectanglePointsCoordinates[3]);

       Rectangle rectangle = new Rectangle(bottomLeft,topRight);

       int inputCount = Integer.parseInt(scanner.nextLine());

       while(inputCount-- > 0){
           int [] pointsCoordinate = parseCoordinates(scanner.nextLine());
           

//           int [] pointsCoordinate = Arrays.stream(scanner.nextLine().split("\\s+"))
//                   .mapToInt(e ->Integer.parseInt(e)).toArray();
           Point point = new Point(pointsCoordinate[0],pointsCoordinate[1]);

           boolean contains = rectangle.contains(point);
           System.out.println(contains);
       }

    }

    public static int[] parseCoordinates(String input) {
        return Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer ::parseInt).toArray();
    }
}
