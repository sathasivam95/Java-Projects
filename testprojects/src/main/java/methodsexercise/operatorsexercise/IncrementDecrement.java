package methodsexercise.operatorsexercise;

public class IncrementDecrement {

    public static void main(String[] args) {

//        int a=3, b=4, c;
//
//        c = a + b + a++ + b++ + ++a + ++b;
//
//        System.out.println(c);
//
//        /* a++ (executes increment later)
//           ++a (executes increment first)
//         */
//
//        /* c = 3 + 4 + a++ + b++ + ++a + ++b;
//           c = 7 + 3 + 4 + (3+1)+1 + (4+1)+1
//           c = 14 + (4)+1 + (5)+1;
//           c = 14 + 5 + 6;
//           c = 14 + 11;
//           c = 25;
//         */
//
//        int d=15;
//        d = d++ + ++d;
//        System.out.println(d);
//
//        /*  d = 15 + (15+1)+1;
//            d = 15 + (16)+1;
//            d = 15 + 17;
//            d = 32;
//        */
//
//        int e=15;
//        e = ++e + e++;
//        System.out.println(e);
//        /* e = (15+1) + e++;
//            e = 16 + (16);
//            e = 16 + 16;
//            e = 32;
//        * */
//
//        int f = 10, g=20;
//        int h = f++ + g++;
//        System.out.println("h is " +h);
//        /* h = 10 + 20;
//            h = 30;
//        * */

//        int a = 0, b = 0;
//        int c = --a * --b * --a * b--;
//        System.out.println(c);

        int a = 1;
        int b = a++ + ++a * --a - a--;
        System.out.println(b);

        int c =5;
        System.out.println(c & 1);
        // 0101 & 0001 = 0001

        int d = 5;
        int e = (d ^ 3) ^ d;
        System.out.println(e);


    }

}
