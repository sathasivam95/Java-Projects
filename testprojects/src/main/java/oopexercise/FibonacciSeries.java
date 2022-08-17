package oopexercise;

public class FibonacciSeries {


    /*
    * nth term = 6
    * output must be 8
    *
    * nth term = 12
    * output must be 144
    *
    * nth term = 0
    * output is 0
    *
    * nth term = 1,2
    * output is 1
    *
    * */
    static int fibonacci(int n){
        if(n<=1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibonacci(n));

    }

}
