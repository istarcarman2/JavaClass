package BishworajPoudel101;
import java.io.File;

public class FileMarker {

    public static void main(String[] args) {
        try {
            File f = new File("contact.csv");
      if(f.createNewFile()){
          System.out.println("File created sucessfully");
      }else {
          System.out.println("file already exit");
      }

        }catch(Exception ex ){
            System.out.println("something went wrong");

        }
    }
}
