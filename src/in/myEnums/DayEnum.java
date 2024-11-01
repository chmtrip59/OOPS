package in.myEnums;

public enum DayEnum {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    //For question no.97

    private final boolean isWeekday;

    DayEnum(boolean isWeekday){
       this.isWeekday =isWeekday ;

    }

    public String getType(){
        return isWeekday ? "Weekday" : "Weekend" ;
    }
}
