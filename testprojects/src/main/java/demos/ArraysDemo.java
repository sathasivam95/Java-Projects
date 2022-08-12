package demos;

public class ArraysDemo {

    public static void main(String[] args) {
//        int []marks;
//        marks = new int[6];

//        int []marks = new int[6];
//
////        marks[0] = 95;
////        marks[1] = 76;
////        marks[2] = 84;
////        marks[3] = 20;
//
//        int []marks2 = {60,78,98,76,37,54};
//
//        System.out.println(marks2[2]);
//
//
//        int [][]marks3 = new int[3][50]; // first array rows, second array columns

        float[] oneD = new float[50];

        char[] c1,c2,c3;

        int[][] a = new int[3][4];
        int[][] b = new int[4][];

        b[0] = new int[5];
        b[1] = new int[3];
        b[2] = new int[100];
        b[3] = new int[4];

        int[][]c = {
                {2,3,4,5},
                {5,6,4,3},
                {7,8,9,0}
        };
        a[0][0] = 85;
        a[2][3] = 78;
        System.out.println(c);

    }

}
