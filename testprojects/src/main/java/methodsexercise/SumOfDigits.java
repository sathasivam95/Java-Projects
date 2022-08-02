package methodsexercise;

import java.util.Scanner;

public class SumOfDigits {

    static int sumOfTwoIntegers(int a, int b){
        return a+b;
    }

    static void printWelcomeMessage(){
        System.out.println("Welcome");
    }

    static boolean isTwoDigit(int a){
        return a >= 10 && a <= 99;
    }

    public static void main(String[] args) {

        printWelcomeMessage();
        System.out.println("Sum: " +sumOfTwoIntegers(2,3));

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int a = sc.nextInt();
        System.out.println("Is the number a two digit number? "+isTwoDigit(a));


    }

}
