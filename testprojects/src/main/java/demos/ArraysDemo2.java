package demos;

import java.util.Scanner;

public class ArraysDemo2 {


    public static int solution(int[] arr) {
        int profit;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    profit = arr[i] - arr[j];
                    return profit;
                }
                return arr[j] - arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {

//        int[] a= {2,3,4,5,1,6};
        //a[0] a[1] a[2] a[3] a[4] a[5]
        System.out.println(solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));


//        for(int i=0; i<a.length; i++){
//            a[i]=sc.nextInt();
//        }
//
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

    }

}
