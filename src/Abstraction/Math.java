package Abstraction;

public abstract class Math {


    // Abstraction: hiding the code and showing the implemention
    // if the class is normal, we cannot have abstract methods
    // both class and methods have to be abstract
    // if we have abstract methods, we need to IMPLEMENTS
    // Abstract class can have NORMAL and ABSTRACT METHODS

    int math;


    public abstract void add (int a, int b);// abstract method cannot have a body

    public void sub ( int a, int   b) {
        math = a-b;
        System.out.println("Substract two numbers "+ math);

    }


}
