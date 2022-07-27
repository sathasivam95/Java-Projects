
public class First { // case-sensitive

    public static void main(String[] args) {
        // Method
        // System.out.println("Hello World");
        // System.out.print("Hello World"); // syntax

        // variables are typed in camelCased
        int ticketPrice; //variable declaration -datatype variableName
        ticketPrice = 900; // assigning value
        boolean paid = true;
        char c = 't';
        System.out.println(paid);
        System.out.println(c);
        System.out.println("ticket price is " + ticketPrice);

        System.out.println("Hello\nworld"); // escape sequences
        System.out.println("\"Hello World\"");

        int ticketPrice2 = 0XA; // Hexadecimal
        long lng = 7L;
        float pi = (float) 314159e-05;
        float pi2 = (float) 3.14159;
        int n = 0b01001101;
        int n2 = 123_456_789; // underscored improves readability
        System.out.println(pi);

        byte b; // 1 byte
        int n1 = 10; // 4 bytes
        // n1 = b; // automatic type conversion
        b = (byte) n1; // explicit declaration
        System.out.println(b);

    }

}
