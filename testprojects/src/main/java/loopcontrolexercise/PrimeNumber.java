package loopcontrolexercise;

import java.util.Scanner;

public class PrimeNumber {

    // For example 2, 3, 5, 7, 11, 13, 17.... are prime numbers.
    public static void main(String[] args) {

        int n;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see if it is a prime or not: ");
        n = sc.nextInt();

        // need to use break
        // 0 and 1 are not prime numbers
        // if it is divisible by 2, then is not a prime number
        for(int i=2; i<=n/2; i++){
            // condition for non-prime numbers
            if(n%i==0){
                isPrime = false;
                break;
            }

        }

        if(isPrime){
            System.out.println(n+ " is a prime number");
        }else{
            System.out.println(n+ " is not a prime number");
        }


    }

}
