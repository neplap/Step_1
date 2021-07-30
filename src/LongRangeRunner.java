public class LongRangeRunner extends Runner {
    protected int meterInSecond;
    protected int longRangeInMeter;


    public LongRangeRunner(int meterInSecond, int longRangeInMeter, int time) {
        super.time = time;
        this.meterInSecond = meterInSecond;
        this.longRangeInMeter = longRangeInMeter;
    }


    @Override
    public boolean run() {
        System.out.println("Time in second: " + time + ". Meter in second: " + meterInSecond + ". Long range in meter: " + longRangeInMeter);
        int result1 = longRangeInMeter / meterInSecond;
        if (result1 <= time) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public SportType getSportType() {
        return SportType.LONG_RANGE_RUNNER;
    }
}
