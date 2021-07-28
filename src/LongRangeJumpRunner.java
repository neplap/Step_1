public class LongRangeJumpRunner extends LongRangeRunner implements Jump {

    protected int barrierInSecond;
    protected int amountBarriers;


    public LongRangeJumpRunner(int longRange, int meterInSecond, int longRangeInMeter) {
        super(longRange, meterInSecond, longRangeInMeter);

    }

    public boolean run() {
        return false;
    }


    @Override
    public boolean jump() {
        System.out.println("Time: " + time + ". barrier In Second: " + barrierInSecond + ". Amount Barriers: " + amountBarriers);
        int result2 = amountBarriers / barrierInSecond;
        if (result2 <= time) {
            System.out.println("Успел! " + result2 + "sec" + "<=" + time + "sec");
        } else {
            System.out.println("Не успел! " + result2 + "sec" + ">=" + time + "sec");
        }
        System.out.println();
        return false;
    }

    @Override
    public SportType getSportType() {
        return getSportType();
    }

}
