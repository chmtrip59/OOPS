package in.myEnums;

public class challenge97 {
    public static void main(String[] args) {
        System.out.println("Printing all the day of the week");

        for (DayEnum value : DayEnum.values()) {
            System.out.printf("%s : %s,\n",value,value.getType());
        }
    }
}
