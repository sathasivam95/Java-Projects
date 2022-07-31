package loopexercise;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int i=1;
        int fact=1;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        num = sc.nextInt();
        for(i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("The factorial for " + num + " is " + fact);

    }

}
