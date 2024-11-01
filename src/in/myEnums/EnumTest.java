package in.myEnums;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
//        System.out.println(DayEnum.MONDAY);
//        System.out.println(DayEnum.TUESDAY);
//        System.out.println(DayEnum.WEDNESDAY);
//        System.out.println(DayEnum.THURSDAY);
//        System.out.println(DayEnum.FRIDAY);
//        System.out.println(DayEnum.SATURDAY);
//        System.out.println(DayEnum.SUNDAY);
        for (DayEnum value : DayEnum.values()) {
            System.out.println(value);
        }


    }
}
