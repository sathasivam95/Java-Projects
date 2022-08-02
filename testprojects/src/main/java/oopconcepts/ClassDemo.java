package oopconcepts;

class Box {

    int length; // instance variables
    int breadth;
    int height;



    // Constructor
    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Setters used to change the values
    void setDim(int length, int breadth, int height){ // this pointer
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    int volume(){
        return length*breadth*height;
    }

//    void protected finalize(){
//
//    }

}

public class ClassDemo {

    public static void main(String[] args){

        Box blackBox = new Box(5,4,3);
        Box woodenBox = new Box(5,6,7);
        Box cardBoardBox = new Box(8,9,10);
        Box greenBox = new Box(10,20,30);

        blackBox.setDim(6,2,3);

        blackBox.setDim(10,29,35);

        // Storing data
        blackBox.length = 10;
        blackBox.breadth = 8;
        blackBox.height = 20;

        System.out.println(blackBox.length);

        // Invoking a method
        System.out.println("Volume of black box is " +blackBox.volume());

//        blackBox = null; // de-referencing

        woodenBox.length = 20;
        woodenBox.breadth = 8;
        woodenBox.height = 50;
        System.out.println(woodenBox.length);

        // Invoking a method
        System.out.println("Volume of wood box is " +woodenBox.volume());




    }


}
