package loopexercise;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {

        int i,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        n = sc.nextInt();
        System.out.println("The odd numbers are: ");
        for(i=1;i<=n ;i++){
            System.out.print((2*i)-1);
        }

    }

}
