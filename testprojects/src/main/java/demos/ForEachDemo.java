package demos;

public class ForEachDemo {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        int sum = 0;

//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        // For each x present in the array
        for(int x: arr){
            System.out.println(x);
        }
        for(int j: arr){
           sum += j;
        }
        System.out.println("Sum is "+sum);

    }

}
