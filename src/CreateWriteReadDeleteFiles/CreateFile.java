package CreateWriteReadDeleteFiles;

import java.io.File;
// Create New File
public class CreateFile {



    public static void main(String[] args) {
        try{
            File f = new File("newfile.txt");
            if(f.createNewFile()){
                System.out.println("file is successfully create "+ f.getName());

            }else {
                System.out.println("file already exit");
            }


        }catch(Exception e ){
            System.out.println("Something went wrong");
        }

    }
}

