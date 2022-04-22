import java.util.Arrays;

public enum DancingClass {
    WALTZ (new String[]{"09:00", "11:00"}, Week.MONDAY.name(), Week.FRIDAY.name()) {public DancingClass alternative() {return TANGO;}},
    TANGO (new String[]{"10:00", "12:00"}, Week.TUESDAY.name(), Week.THURSDAY.name()) {public DancingClass alternative() {return FLAMENCO;}},
    FLAMENCO (new String[]{"11:00", "13:00"}, Week.WEDNESDAY.name(), Week.MONDAY.name()) {public DancingClass alternative() {return SALSA;}},
    SALSA (new String[]{"12:00", "14:00"}, Week.THURSDAY.name(), Week.TUESDAY.name()) {public DancingClass alternative() {return SAMBA;}},
    SAMBA (new String[]{"13:00", "15:00"}, Week.FRIDAY.name(), Week.WEDNESDAY.name()) {public DancingClass alternative() {return WALTZ;}};

    private String[] Time;
    private String dayFirst;
    private String daySecond;

    DancingClass(String[] time, String dayFirst, String daySecond) {
        Time = time;
        this.dayFirst = dayFirst;
        this.daySecond = daySecond;
    }

    public String[] getTime() {
        return Time;
    }

    public String getDayFirst() {
        return dayFirst;
    }

    public String getDaySecond() {
        return daySecond;
    }

    public abstract DancingClass alternative ();

}
