package oopconcepts;

public class PassingRefDemo {

    static void increment(int a){
        a++;
    }

    public static void main(String[] args){

        int a = 10;
        increment(a);
        increment(a);
        System.out.println(a);

        Box b4 = new Box(5,3,4);
        Box b5 = new Box(5,3,4);

        System.out.println(b4.isEqual(b5));
        System.out.println(b5.length);

    }


}
