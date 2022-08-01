package demos;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter demos.First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        char operator;
        System.out.println("Enter the Operator +,-,*,/ or %: ");
        operator = sc.next().charAt(0); // stores character at index 0

        switch (operator) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a%b));
                break;
            default:
                System.out.println("You have entered an incorrect operator");
        }

//        // lambda expression
//        switch (operator) {
//            case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
//            case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
//            case '*' -> System.out.println(a + " * " + b + " = " + (a * b));
//            case '/' -> System.out.println(a + " / " + b + " = " + (a / b));
//            case '%' -> System.out.println(a + " % " + b + " = " + (a % b));
//            default -> System.out.println("You have entered an incorrect operator");
//        }

    }

}
