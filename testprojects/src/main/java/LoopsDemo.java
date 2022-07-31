import java.util.Scanner;

public class LoopsDemo {

    public static void main(String[] args) {
        // Print * 500 times
        int counter;

//        for (counter=1; counter<=5; counter++){ // counter/i - iterator
//            System.out.println("*");
//        }

//        int i =1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }
        // Infinite Loop
//        while(i<=5){
//            System.out.println(i);
//
//        }
        // do-while loop
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=5);
        int i = 1;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many stars do you want? ");
        n = sc.nextInt();

        do {
            System.out.print("*");
            i++;
        }
        while (i<=n);
    }




}
