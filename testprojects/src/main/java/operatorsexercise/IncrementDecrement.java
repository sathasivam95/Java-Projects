package operatorsexercise;

public class IncrementDecrement {

    public static void main(String[] args) {

        int a=3, b=4, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println(c);

        /* a++ (executes increment later)
           ++a (executes increment first)
         */

        /* c = 3 + 4 + a++ + b++ + 4 + 5;
           c = 16 + a++ + b++;
           16 is now stored in c
           c = 16 + 4 + 5;
           c = 25;
         */


    }

}
