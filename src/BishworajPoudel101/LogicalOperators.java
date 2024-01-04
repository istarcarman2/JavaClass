package BishworajPoudel101;

public class LogicalOperators {

    /*
    && This is and. Return true if all conditions are true
    || This is or. Return true if one of the statements is true.
    ! This will reverse the result. Return false if the result is true.

   */
    public static void main(String[]args){

        int userid = 123;
        int userpin = 456;
        System.out.println((userid == 123) && (userpin == 456)); // true
        System.out.println((userid== 123) || (userpin == 456)); // true
        System.out.println((userid== 123) != (userpin == 456)); // false
    }
}
