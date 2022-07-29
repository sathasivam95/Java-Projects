package codingexercises;

public class Numbers {

    int extraNumber(int a, int b, int c){
        if(a==b){
            return c;
        } else if (a==c) {
            return b;
        }else
            return a;

        // Alternative
        // return (a==b)?c:(a==c)?b:a;
    }


    public static void main(String[] args) {

    }

}
