package CreateWriteReadDeleteFiles;

import java.io.File;

public class DeleteFile {



        public static void main(String[] args) {
            File f = new File("newfile.txt");
            if (f.delete()) {
                System.out.println("Successfully deleted the file: " + f.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }

