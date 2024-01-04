package BishworajPoudel101;

public class SwapTwoNumbers {
    // SwapTwoNumbers
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swapping a "+a+" b "+ b);

        int temp; // created temporary bucket
        temp = a; // a (10 )value stored inside the temp bucket.
        a=b; // b (20)value stored inside the a bucket.
        b= temp; // value (10) insid the b bucket.
        System.out.println("After swapping a "+a+" b "+ b);



    }
}
