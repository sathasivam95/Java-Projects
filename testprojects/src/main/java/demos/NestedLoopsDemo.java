package demos;

public class NestedLoopsDemo {
/*
    i=1, condition is true on the outer loop, so it continues
    to the inner loop. j=1, condition is true, so it prints the star
    , then j=2, condition is true, so it prints the second star
    , until j=5. j=6, the condition of inner loop fails, so it closes
    the loop and executes the "print next line statement". Outer loop
    continues with i=2 and the cycle continues until i=5. i=6 the
    condition of the outer loop fails and closes the program.
 */
    public static void main(String[] args) {

//        // controls the row
//        for(int i=1; i<=5; i++){
//            // controls the print of stars
//            for(int j=1; j<=5; j++){ // prints the stars
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // controls the row
        outerLoop:
        for(int i=1; i<=5; i++){
            // controls the print of stars
            innerLoop:
            for(int j=1; j<=i; j++){ // prints the stars
                if(i==3)
                    //break outerLoop; // labelled break goto from other languages
                    continue outerLoop;
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
