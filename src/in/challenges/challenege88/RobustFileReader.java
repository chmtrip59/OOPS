package in.challenges.challenege88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the fileName:");
        String fileName = in.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }
        }catch (FileNotFoundException exp){
            System.out.printf("File not found exp handled %s",exp.getMessage());
        }


        catch (IOException exp){
            System.out.printf("Exception Occurred %s",exp.getMessage());
        }
    }
}
