import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your rating from 1 to 5? ");

        int rating = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter email: ");

        String email = scanner.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("You rated us " + rating);
        System.out.println("Email is " + email);
    }

}
