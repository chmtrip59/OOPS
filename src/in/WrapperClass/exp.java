package in.WrapperClass;

public class exp {


    public static void main(String[] args) {
//        Integer a = new Integer(55);
        Integer a = Integer.valueOf(55);
        Integer a1 = Integer.valueOf("55");
        Integer a2 = 55;
        Integer a3 = null;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        Integer first = 55;//Autoboxing
        System.out.println(first);
        int second = first;//Autoboxing unboxed
        System.out.println(second);

    }
}
