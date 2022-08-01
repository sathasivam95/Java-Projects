package demos;

public class RelationalOperators {

    public static void main(String[] args) {

//        int a =10, b=10; // if
//
//        System.out.println(a>b);
//        System.out.println(a<b);

        // Bitwise demos.Operators
//        int a=9, b=12;
//
//        int c = a & b;
//        System.out.println("a&b is " + c);
//        c = a | b;
//        System.out.println("a|b is " +c);
//        c = a ^ b;
//        System.out.println("a^b is " + c);
//        c = ~a;
//        System.out.println("~a is " + c);

        byte a=4;
        System.out.println(a<<1); // promoted to int

        int c =-5;

        c = c&1;
        c &=1;
        System.out.println("Right shift " +(c>>1));
        System.out.println("Right shift with zero fill " +(c>>>1));

    }

}
