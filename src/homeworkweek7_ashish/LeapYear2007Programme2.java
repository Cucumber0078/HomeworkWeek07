package homeworkweek7_ashish;

import java.util.Scanner;

public class LeapYear2007Programme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Year");
        int year = scanner.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
            System.out.println(year + " is a Leap year");
         else {
            System.out.println((year + "is not a leap year"));


        }
    }}
