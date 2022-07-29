import java.util.Scanner;
/*
    >=90 - A
    80 - 89 - B
    70 - 79 - C
    60 - 69 - D
    <60 - E
* */
public class IfElseDemo {

    public static void main(String[] args) {
//        int num;
//
//        // Scanner Object
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        num = sc.nextInt();
//
//        if(num<0){
//            System.out.println(num + " number is negative");
//        }else if(num==0){
//            System.out.println(num + " number is neutral");
//        }
//        else {
//            System.out.println(num + " number is positive");
//        }

        int mark;

        // Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks (0-100): ");
        mark = sc.nextInt();

        /* We do not need the upper bound as the first condition is failed
        it will move on to the next else if condition */
        if(mark >=90){
            System.out.println("Grade A");
        } else if (mark>=80) {
            System.out.println("Grade B");
        }else if (mark>=70) {
            System.out.println("Grade C");
        }else if (mark>=60) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade E");
        }
    }

}
