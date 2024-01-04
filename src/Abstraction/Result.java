package Abstraction;

public class Result extends Math{

    public static void main(String[] args) {

        Result obj = new Result();
        obj.add(30,70);
        obj.sub(50,10);


    }


    @Override
    public void add(int a, int b) {
        math = a+b;
        System.out.println("Add two number "+ math);

    }
}
