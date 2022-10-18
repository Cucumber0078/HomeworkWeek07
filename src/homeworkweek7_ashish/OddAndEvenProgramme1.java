package homeworkweek7_ashish;

import java.util.Scanner;

public class OddAndEvenProgramme1 {
        public static void main(String[] args) {
              Scanner scanner=new Scanner(System.in);
            System.out.println("Enter value number");
            int value= scanner.nextInt();

            String result=value%2==0? "odd": "even";
            System.out.println(value + " is " +result );



              }
        }
