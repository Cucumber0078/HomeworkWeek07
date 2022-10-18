package homeworkweek7_ashish;

import java.util.Scanner;

public class NumberOddOrEvenProgramme6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number= Integer.parseInt(scanner.nextLine());


        {

            if (number % 2 == 0)
                System.out.println(number + " is Even");
            else
                System.out.println(number + " is odd");
        }
    }


    }
