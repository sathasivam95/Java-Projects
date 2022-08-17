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

    //Constructor Overload
    Box(){
        length = -1;
        breadth = -1;
        height = -1;
    }

    // Constructor with an object as a parameter --> Copy constructor
    Box(Box b){
        length = b.length;
        breadth = b.breadth;
        height = b.height;
    }

    Box(int l){
        length = breadth = height = l;
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

    boolean isEqual(Box b){
        b.length++;
        // blackbox invoking = b1 is passing
        if(length == b.length && breadth == b.breadth && height == b.height)
            return true;
        return false;
    }

    Box doubleBox(){
        Box temp = new Box(2 * this.length, 2 * this.breadth, 2 * this.height);
        return temp;

//        temp.length = 2 * this.length;
//        temp.breadth = 2 * this.breadth;
//        temp.height = 2 * this.height;
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

//        blackBox.setDim(6,2,3);

        blackBox.setDim(6,5,3);

        // Storing data
//        blackBox.length = 10;
//        blackBox.breadth = 8;
//        blackBox.height = 20;

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

        Box b1 = new Box(6,4,3);

        Box b2 = new Box(12);

        System.out.println("black box == b1 " +blackBox.isEqual(b1));

        System.out.println("b2 height is: " + b2.height);

        Box b3 = new Box(b1); // b3 copies b1

        Box b4 = new Box(5,3,4);
        Box b5 = new Box(5,3,4);
        System.out.println(b4.isEqual(b5));
        System.out.println(b4.length);


    }


}
