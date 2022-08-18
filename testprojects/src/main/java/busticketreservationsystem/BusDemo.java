package busticketreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public static void main(String[] args) {
        // Bus[] buses = new Bus[50]; // 50 Bus Objects
        // ArrayList - Collection
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        // Adding new bus objects into the arraylist
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));

        int userOption = 1;
        Scanner sc = new Scanner(System.in);

        for (Bus b: buses) {
            b.displayBusInfo();
        }

        while (userOption==1) {
            System.out.println("Enter 1 to Book and 2 to Exit");
            userOption = sc.nextInt();
            if (userOption == 1){
                // Booking objects are added into the list, if there is availability
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else
                    System.out.println("Sorry. Bus is full. Try another bus or date");
            }
        }
    }

}
