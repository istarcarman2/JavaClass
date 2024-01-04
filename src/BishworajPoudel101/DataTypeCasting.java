package BishworajPoudel101;

public class DataTypeCasting {

     //Implicit Type
    //  It is done automatically when the value is stored in a variable of a larger data type.
    // Example = If you store an INT value into a LONG variables.
    // It will be done automatically.

    public static void main(String[]args){

        int largerBucket = 10;
        long SmallerBucket = largerBucket; // Automatic casting into long
        System.out.println("Value of largerBucket is = "+ largerBucket);
        System.out.println("Value of SmallerBucket is = "+SmallerBucket);
        ConvertingLongIntoInt();

    }

    public static void ConvertingLongIntoInt(){

        long SmallerBucket = 20;
        int LargerBucket = (int) SmallerBucket; // Manual casting: long to int
        System.out.println("Value of SmallerBucket = "+ SmallerBucket);
        System.out.println("Value of LargerBucket = "+LargerBucket);

    }
}
