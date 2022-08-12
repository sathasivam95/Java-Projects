package oopexercise;

public class Student {

    String name;
    Integer rollNo;
    Integer[] marks;

    Student(String name, Integer rollNo, Integer[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Student(){

    }


    int marksTotal(){
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }


    public static void main(String[] args) {
        Student st1 = new Student("Siva",101,new Integer[]{90,30,20,40,50});


        System.out.println(st1.marksTotal());

    }

}
