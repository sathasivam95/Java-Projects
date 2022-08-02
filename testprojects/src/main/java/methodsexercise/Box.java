package methodsexercise;

public class Box {

    Integer length;
    Integer width;
    Integer height;

    // Since you are invoking a method from an object, do not use static
    int surfaceArea(){
        // SA = 2lw + 2lh + 2wh
        return 2*(length*width) + 2*(length*height) + 2*(width*height);
    }

    public static void main(String [] args){
        Box blackBox = new Box();

        blackBox.length = 20;
        blackBox.width = 20;
        blackBox.height = 20;

        System.out.println("Surface Area of the black box is: "+blackBox.surfaceArea());
    }

}


