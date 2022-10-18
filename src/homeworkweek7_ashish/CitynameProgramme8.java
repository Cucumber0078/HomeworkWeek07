package homeworkweek7_ashish;

import java.util.Scanner;

public class CitynameProgramme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade;
        System.out.println("Enter A to E");
        grade = scanner.next().charAt(0);



        if ( grade == 'A') {
            System.out.println("America");
        } else if (grade == 'B') {
            System.out.println("Bombay");
        } else if ( grade == 'C') {
            System.out.println("Canada");
        } else if (grade == 'D') {
            System.out.println("Denmark");
        } else if ( grade == 'E') {
            System.out.println("Europe");
        } else if(grade == 'F') {
         System.out.println("France");
    }else{
            System.out.println("Invalid input");


}
    }





}
