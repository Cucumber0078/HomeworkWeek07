package homeworkweek7_ashish;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        calculator();

    }
    public static void calculator(){
        int A;
        int C;
        char X;

        Scanner scanner= new Scanner(System.in);
        System.out.println();
        System.out.println("Enter yur first value");
        A= scanner.nextInt();
        System.out.println("Enter your second value");
        C= scanner.nextInt();
        System.out.println("press Symbol");
        X= scanner.next().charAt(0);
        System.out.println();
        if (X=='+'){
            System.out.println("Addition of "+A+"+"+C+"=" +(A+C));
        }
        else if (X=='-'){
            System.out.println("Subtraction of "+A+"-"+C+"="+(A-C));
        }
        else if (X=='*'){
            System.out.println("Multiplication of "+A+"*"+C+(A*C) );
        }
        else if (X=='/'){
            System.out.println("Division of " +A+ "/" +C+ +(A/C) );
        }else
            System.out.println("invalid Entry");


}}
