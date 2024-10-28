package in.VariableArguments;

public class ForStringVariable {


        // Method that uses varargs for String parameters
        public static void printMessages(String... messages) {
            for (String message : messages) {
                System.out.print(message+" ");
            }
        }

        public static void main(String[] args) {
            // Calling the method with different numbers of arguments
            printMessages("Hello");
            printMessages("Welcome", "to", "the", "world", "of", "Java");
            printMessages("This", "is", "a", "varargs", "example");
        }


}
