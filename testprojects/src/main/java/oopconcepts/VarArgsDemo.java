package oopconcepts;

public class VarArgsDemo {

    static int minValue(int... vals){
        int min = Integer.MAX_VALUE; // vals[0]
        for (int k:vals) {
            if(k<min)
                min = k;
        }
        return min;
    }

    static double minValue(double... vals){
        double min = Integer.MAX_VALUE; // vals[0]
        for (double k:vals) {
            if(k<min)
                min = k;
        }
        return min;
    }

    public static void main(String[] args) {
        int m = minValue(5,2,6);
        System.out.println(m);
        int n = minValue(4,7,2,0,-1);
        System.out.println(n);
        double d = minValue(4.3,7.2,2.3,0.9,-1.63);
        System.out.println(d);


    }

}
