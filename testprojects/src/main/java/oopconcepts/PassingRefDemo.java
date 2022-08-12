package oopconcepts;

public class PassingRefDemo {

    // different memory locations
    static int increment(int a){
        return a++;
    }
    public static void main(String[] args) {
        int a = 10;
        increment(a);
        System.out.println(a);

    }

}
