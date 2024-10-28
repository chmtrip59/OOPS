package in.challenges.challenge87;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to calculator\n");

        System.out.print("Enter the first number:");
        int a = in.nextInt();
        System.out.print("Enter the Second number:");
        int b = in.nextInt();

        try{
            int result = a / b;
            System.out.println("Result is :"+result );
        }catch(ArithmeticException e){
            if(e.getMessage()
                    .equals("/ by zero")){
                System.out.println("Divide by zero occurred");
            }else{
                throw e;
            }
        }

    }
}
