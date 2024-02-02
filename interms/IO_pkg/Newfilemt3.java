package interms.IO_pkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Newfilemt3 {

    /**
     * @param args
     */
    public static void main(String args[]) {

        try {
            String dirname = "lijava";
            File directory = new File(dirname);

            // Create directory now.
            directory.mkdirs();
            // file obj
            File file = new File("lijava/Javasyntax.java");

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            // Write Content
            FileWriter writer = new FileWriter(file);
            writer.write("public class Javasyntax {\r\n" + //
                                "    \r\n" + //
                                "    public static void main(String[] args) {\r\n" + //
                                "        \r\n" + //
                                "        System.out.println(\"hello world\");\r\n" + //
                                "    }\r\n" + //
                                "}");
            writer.close();

            // read content
           /*** 
            */
            
            try (
                    FileReader reader = new FileReader(file)) {
                int c;
                while ((c = reader.read()) != -1) {
                    char ch = (char) c;
                    System.out.print(ch);
                }
            }

            // delete file
            /**
             * if (file.exists()) {
             * boolean success = file.delete();
             * if (success) {
             * System.out.println("The file has been successfully deleted.");
             * } else {
             * System.out.println("The file deletion failed.");
             * }
             * } else {
             * System.out.println("The file is not present.");
             * }
             */
        } catch (IOException e) {
            System.out.print("Exception" + e);
        }
    }
}
