public class LongRangeJumpRunner extends LongRangeRunner implements Jump {

    protected int barrierInSecond;
    protected int amountBarriers;


    public LongRangeJumpRunner(int time, int meterInSecond, int longRangeInMeter,int barrierInSecond, int amountBarriers) {
        super(time, meterInSecond, longRangeInMeter);
        this.barrierInSecond = barrierInSecond;
        this.amountBarriers = amountBarriers;

    }

    public boolean run() {
        System.out.println("Бежим");
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
