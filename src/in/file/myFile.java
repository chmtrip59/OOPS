package in.file;

import java.io.FileReader;
import java.io.IOException;

public class myFile{
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try(FileReader reader = new FileReader(fileName)) {
        int read = 0;

        do{
            read = reader.read();
            System.out.print((char)read);
        }while(read != -1);



        }catch(IOException exp){
            System.out.printf("Exception occurred : %s",exp.getMessage());
        }
    }
}
