package oopconcepts;

public class Stack {

    // Instance Variables
    private int[] s = new int[10];
    private int tos; // top of stack

    Stack(){
        tos = -1;
    }

    // - 1 -> 0 in memory then stores in s
    public void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            s[++tos] = item;
    }

    public int pop(){
        if(tos>=0){
            return s[tos--];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
}
