package oopexercise;
/*
* Write overloaded methods to find average of 2 or 3 numbers
* */
public class AverageOfNumbers {

    static double average(double a, double b){return (a+b)/2;}

    static double average(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        System.out.println(average(2.2,3));
        System.out.println(average(1,2,3));
//        average()

    }

}
