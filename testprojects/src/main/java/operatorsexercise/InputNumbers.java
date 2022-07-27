package operatorsexercise;

import java.util.Scanner;

public class InputNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a,b,add,sub,mul,div,mod;

        System.out.println("Enter first digit: ");
        a = sc.nextInt();
        System.out.println("Enter second digit: ");
        b = sc.nextInt();

        add = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        mod = a%b;

        System.out.println("Addition: " +add);
        System.out.println("Subtraction: " +sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " +div);
        System.out.println("Modulus: " +mod);


    }

}
