package in.file;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try(FileWriter writer = new FileWriter(fileName)) {

            writer.write("This is the best java course");
            for(int i = 1;i < 10000;i++){
                writer.write('C');
            }
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.printf("Exception Occurred %s ",e.getMessage());
//            throw new RuntimeException(e);
        }
    }
}
