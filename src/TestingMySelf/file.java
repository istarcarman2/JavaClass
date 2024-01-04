package TestingMySelf;

import java.io.File;
import java.io.FileWriter;

public class file {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("name.txt");
            fw.write("Istar Carman");
            fw.close();
            System.out.println("file wrote");
        }catch(Exception ex){
            System.out.println("I did something wrong");
        }
    }
}
