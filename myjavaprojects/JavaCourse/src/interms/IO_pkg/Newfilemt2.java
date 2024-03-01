
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Newfilemt2 {

    /**
     * @param args
     */
    public static void main(String args[]) {

        try {
            String dirname = "user";
            File directory = new File(dirname);

            // Create directory now.
            directory.mkdirs();
            // file obj
            File file = new File("user/user.txt");

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            // Write Content
            FileWriter writer = new FileWriter(file);
            writer.write("\r\n" + //
                    "            Day 1: {\r\n" + //
                    "                morning: corejava,\r\n" + //
                    "                afternoon: advancejava,\r\n" + //
                    "                evening: database\r\n" + //
                    "            },\r\n" + //
                    "            Day 2: {\r\n" + //
                    "                morning: advancejava,\r\n" + //
                    "                afternoon: corejava,\r\n" + //
                    "                evening: database\r\n" + //
                    "            },\r\n" + //
                    "            Day 3: {\r\n" + //
                    "                morning: database,\r\n" + //
                    "                afternoon: advancejava,\r\n" + //
                    "                evening: corejava\r\n" + //
                    "            }");
            writer.close();

            // read content
            /**
             * 
             * try (
             * FileReader reader = new FileReader(file)) {
             * int c;
             * while ((c = reader.read()) != -1) {
             * char ch = (char) c;
             * System.out.print(ch);
             * }
             * }*
             */

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
