package in.CollectionAndGenerics.Challenges;

public class StringConcatinate {
    public static void main(String[] args) {

        System.out.println(concatenate("I am" , "Here to ","Learn new things"));

        System.out.println(concatenate(" Chandra Mauli"));

        System.out.println(concatenate("Tripathi"));

    }
    public static String concatenate(String... strs ){
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
