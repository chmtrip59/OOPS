package in.kgcoding.Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {

        Person person1 =new Person("Golu",30,"124");

        Person person2 = new Person("Golu",30,"124");

//    if(person1 == person2)
      if(person1.equals(person2)){
        System.out.println("Equal");
      }else{
        System.out.println("Not equal");
      }
    }
}
