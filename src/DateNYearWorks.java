import java.time.LocalDate;
import java.time.LocalTime;

public class DateNYearWorks {

    public static void main(String[] args) {

            LocalDate date = LocalDate.now();
            System.out.println(date.getYear());

            localtime();

        }


       public static void localtime(){

        LocalTime time = LocalTime.now();
           System.out.println(time);

       }

}

