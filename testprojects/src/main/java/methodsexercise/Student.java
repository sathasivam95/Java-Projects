package methodsexercise;

import java.lang.reflect.Array;

public class Student {

    String name;
    Integer rollNo;
    int[] marks;

    // Constructor
    public Student(String name, Integer rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    // Since we are invoking a method from an object, do use static modifier
    int marksTotal(){
        return marks[0]+marks[1]+marks[2];
    }

    public static void main(String[] args){
        Student st1 = new Student("Siva",101,new int[]{1,2,3});


        System.out.println("Total Marks of "+ st1.name+ " is " + st1.marksTotal());


    }


}
