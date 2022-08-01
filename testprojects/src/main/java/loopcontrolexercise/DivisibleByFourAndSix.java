package loopcontrolexercise;

public class DivisibleByFourAndSix {

    public static void main(String[] args) {

        int n;
        for(int i=1; i<=100; i++){
            if(i%4==0 || i%6==0){
                continue;
            }
            System.out.println(i);
        }
    }

}
