package oopconcepts;

public class StackDemo {

    public static void main(String[] args){
        Stack s1 = new Stack();
        Stack s2 = new Stack();

        s1.push(5);
        s1.push(6);
        s1.push(8);

        // s is a private datatype that is protected
        // s1.s[7] = 100;

        System.out.println(s1.pop());


    }
}
