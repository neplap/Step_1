public class LongRangeRunner extends Runner {
    protected int longRange;
    protected int meterInSecond;
    protected int longRangeInMeter;


    public LongRangeRunner(int longRange, int meterInSecond, int longRangeInMeter) {
        this.longRange = longRange;
        this.meterInSecond = meterInSecond;
        this.longRangeInMeter = longRangeInMeter;
    }


    @Override
    public boolean run() {
        System.out.println("Time in second: " + time + ". Meter in second: " + meterInSecond + ". Long range in meter: " + longRangeInMeter);
        int result1 = longRangeInMeter / meterInSecond;
        if (result1 <= time) {
            System.out.println("Успел! " + result1 + "sec" + "<=" + time + "sec");
        } else {
            System.out.println("Не успел! " + result1 + "sec" + ">=" + time + "sec");
        }
        System.out.println();
        return false;
    }

    @Override
    public SportType getSportType() {
        return getSportType();
    }
}
