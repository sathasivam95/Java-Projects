package loopcontrolexercise;

public class E {

    public static void main(String[] args) {

        // print 5 rows
//        outerLoop:
//        for(int i=1; i<=5; i++){
//            // prints stars in the shape of E
//            innerLoop:
//            for(int j=1; j<=5; j++) {
//                if(j==2)
//                    continue outerLoop;
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

        {
            int i, j;

            for (i = 0; i < 5; i++) {
                System.out.print("*");
                for (j = 0; j < 5; j++) {
                    if ((i == 0 || i == 5 - 1)
                            || (i == 5 / 2
                            && j <= 5 / 2))
                        System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}
