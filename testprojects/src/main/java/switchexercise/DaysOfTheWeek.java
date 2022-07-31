package switchexercise;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-7: ");
        a = sc.nextInt();

        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The number you have entered is out of range!");
        }

    }

}
