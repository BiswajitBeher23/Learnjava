package interms.IO_pkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Newfilemt2 {

    public static void main(String args[]) {

        try {
            File file = new File("//home//Codedev//");

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            // Write Content
            FileWriter writer = new FileWriter(file);
            writer.write("Test data");
            writer.close();

            try (// read content
                    FileReader reader = new FileReader(file)) {
                int c;
                while ((c = reader.read()) != -1) {
                    char ch = (char) c;
                    System.out.print(ch);
                }
            }
        } catch (IOException e) {
            System.out.print("Exception" + e);
        }
    }
}
