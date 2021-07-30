public class LongRangeJumpRunner extends LongRangeRunner implements Jump {

    protected int barrierInSecond;
    protected int amountBarriers;


    public LongRangeJumpRunner(int time, int meterInSecond, int longRangeInMeter) {
        super(time, meterInSecond, longRangeInMeter);

    }

    public boolean run() {
    return true;
    }


    @Override
    public boolean jump() {
        System.out.println("Time: " + time + ". barrier In Second: " + barrierInSecond + ". Amount Barriers: " + amountBarriers);
        int result2 = amountBarriers / barrierInSecond;
        if (result2 <= time) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public SportType getSportType() {
        return SportType.LONG_RANGE_JUMP_RUNNER;
    }

}
