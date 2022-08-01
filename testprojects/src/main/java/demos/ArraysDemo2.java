package demos;

import java.util.Scanner;

public class ArraysDemo2 {

    public static void main(String[] args) {

//        int[] a= {2,3,4,5,1,6};
        //a[0] a[1] a[2] a[3] a[4] a[5]
        int[] a =  new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 elements of the array: ");

        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }

}
