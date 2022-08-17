package oopconcepts;

/* Factorial
*  5! = 5x4x3x2x1
*  4! = 4x3x2x1
*  4! = 4x3!
* */

public class RecursionDemo {

    // Returns a no and use static as there are no objects
    static int factorial(int n){
        if(n==0) {
            return 1;
        }
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

}
