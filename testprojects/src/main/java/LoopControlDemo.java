import java.util.Scanner;

public class LoopControlDemo {
/*
    Jump Statements - break, continue
    For a given n, find the nearest number
    divisible by 10 that is less than n or equal to n
    E.g.
    90 - 90
    78 - 70
    64 - 60
    99 - 90


    //        while(true){
//            if(n%10==0){
//                System.out.println(n);
//                break;
//            }
//            n--;
//        }

*/


    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            if(i==7) // skips 7
                continue;
            System.out.println(i);
        }
//        double n, sum = 0.0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number. Enter a negative number to stop:\n ");
//
//        while(true){
//            n = sc.nextDouble();
//            if(n < 0.0){
//                break;
//            }
//            sum += n;
//        }
//        System.out.println("Sum is " +sum);








    }

}
