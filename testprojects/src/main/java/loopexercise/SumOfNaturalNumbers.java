package loopexercise;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        int i=1;
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number n: ");
        n = sc.nextInt();

        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural number is = " +sum);

    }

}
