package in.ExceptionAndFileHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Welcome to Division Calculator:\n");
//
//        System.out.print("Please enter your two numbers: ");
//
//        int first = scan.nextInt();
//
//        int second = scan.nextInt();
//        try {
//            int[] a = new int[5];// This is another example for Exception handling
//            System.out.printf("Result is %d", a[6]);
//
//            a[6] = first / second;
//            int result = first / second;
//
//            System.out.printf("Result is %d", result);
//            System.out.printf("Result is %d", a[6]);
//
//
////        } catch (ArithmeticException exception){
//////            System.out.println("Divide by Zero, Enter valid value ");
////            System.out.printf("%s, Enter valid value ",exception.getMessage());
////        }
//            // Catch for array exception
////        catch (ArrayIndexOutOfBoundsException e){
////            System.out.println("Array exception is well handled");
////        }
//        }catch (Throwable th) {
//            System.out.println("My all exception catcher");;
//            throw th;
//        }
    }
// Example for Exception Stack Trace
    private static void a(){b();}
    private static void b(){c();}
    private static void c(){d();}
    private static void d(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Division Calculator:\n");

        System.out.print("Please enter your two numbers: ");

        int first = scan.nextInt();

        int second = scan.nextInt();
        try {
            int[] a = new int[5];// This is another example for Exception handling
            System.out.printf("Result is %d", a[6]);

            a[6] = first / second;
            int result = first / second;

            System.out.printf("Result is %d", result);
            System.out.printf("Result is %d", a[6]);


//        } catch (ArithmeticException exception){
////            System.out.println("Divide by Zero, Enter valid value ");
//            System.out.printf("%s, Enter valid value ",exception.getMessage());
//        }
            // Catch for array exception
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array exception is well handled");
//        }
        }catch (Throwable th) {
            System.out.println("My all exception catcher");;
            throw th;
        }finally{// It will run  always
            System.out.println("I am a Finally");
        }
    }

}
