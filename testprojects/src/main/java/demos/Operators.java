package demos;

public class Operators {

    public static void main(String[] args) {

        // + - * / %
        double  a = 11, b = 2, c;

//        c = a % b;

//        System.out.println(c);

//        a = a+3;
//
//        a += 3; // Compound Assignments
//
//        a *= 3;
//
//        a = a % b;
//        a %= b;

//        a = a + 1;

        a++; // post increment increase by 1
        ++a; // pre increment

        a--; // post decrement decrease by 1
        --a; // pre decrement

        c = a++; // post increment, assigns to C before it increments
        c = ++a; // pre increment, increments first before assigning it to C.

        System.out.println("c is " + c);
        System.out.println("a is " + a);

    }

}
