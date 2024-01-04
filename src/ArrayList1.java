import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {


        public static void main(String[] args) {

            ArrayList<String> names = new ArrayList<>();

            names.add("Paul Carman");
            names.add("Jaden Carman");
            names.add("Joshua Carman");
            names.add("Star Carman");
            Collections.sort(names);

            // to print details
            for(String name: names){
                System.out.println(name);
            }

        }
    }

