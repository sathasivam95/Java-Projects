package oopconcepts;

public class MethodsDemo {

    /*
    * Methods - Carries out a specific task
    * Method Input - Parameters/Arguments
    *
    *
    * */

    // Method Header
    static void boxVolumeDemo(int length, int breadth, int height) { // Method Definition

        // Method Body
        int vol;
        vol = length*breadth*height;
        System.out.println("Volume is: "+vol);

    }

    // Method Header
    // Usual Practice is to return vol
    static int boxVolumeDemo2(int length, int breadth, int height) { // Method Definition

        // Method Body
        int vol;
        vol = length*breadth*height;
        return vol;

    }

    // No objects are available so static is used
    static void printLine(){
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        printLine();
        System.out.println("Hello"); // Method Call
        boxVolumeDemo(1,2,3); // Method Call and Passing Arguments
        int volume = boxVolumeDemo2(2,3,4);
        System.out.println(volume);
        System.out.println(boxVolumeDemo2(2,3,4));
        printLine();
    }

}
