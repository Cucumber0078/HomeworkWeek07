package homeworkweek7_ashish;

import java.util.Scanner;

public class SwitchStatementProgramme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A to F");
        String Ashish;
        Ashish = scanner.next();

        switch (Ashish) {

            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
            case "C":
                System.out.println("Canada");
            case "D":
                System.out.println("Denmark");
            case"E":
                System.out.println("England");
            case "F":
                System.out.println("France");
            default:
                System.out.println("Invalid input");

        }
    }
}