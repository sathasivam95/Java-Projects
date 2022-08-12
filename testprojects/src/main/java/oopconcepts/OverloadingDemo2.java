package oopconcepts;
import java.math.*;
public class OverloadingDemo2 {

    static void test(){
        System.out.println("Test method with no argument");
    }

    static void test(int a){
        System.out.println("Test method with 1 argument");
    }

    static void test(int a, int b){
        System.out.println("Test method with 2 arguments");
    }


    public static void main(String[] args) {
        test();
        test(1);
        test(12,25);

        System.out.println(Math.abs(-4.5));
        System.out.println(Math.abs(10));

    }

}
