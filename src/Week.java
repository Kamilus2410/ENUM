public enum Week implements WorkingDay, Weekend {
    MONDAY (true, "MON"),
    TUESDAY (true, "TUE"),
    WEDNESDAY (true, "WED"),
    THURSDAY (true, "THU"),
    FRIDAY (true, "FRI"),
    SATURDAY (false, "SAT"),
    SUNDAY (false, "SUN");

    private boolean WorkingDay;
    private String shorten;

    Week(boolean WorkingDay, String shorten) {
        this.WorkingDay = WorkingDay;
        this.shorten = shorten;
    }

    public String getShorten() {
        return shorten;
    }

    @Override
    public boolean isWeekend() {
        if (WorkingDay == true) {
            return false;
        } else return true;
    }

    @Override
    public boolean isWorkingDay() {
        if (WorkingDay == true) {
            return true; }
        else return false;
    }
}

