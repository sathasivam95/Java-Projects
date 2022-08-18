package loopexercise.codingexercises;

public class RpgGame {

    boolean reachNextLevel(int experience, int threshold, int reward){
        int totalPoints = experience + reward;
        if(totalPoints >= threshold){
            return true; // boolean is the return value
        }
        else
            return false;
            // Alternative return (experience+reward>=threshold);

    }
    public static void main(String[] args) {

    }

}
