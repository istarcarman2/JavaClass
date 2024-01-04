import java.time.LocalDate;
import java.util.Scanner;

public class age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your birth year");
        int birthyear = sc.nextInt();
        LocalDate date = LocalDate.now();
        int age = date.getYear() - birthyear;
        System.out.println("my age is :  "+age );







    }
}
