public class CircleRunner extends Runner {
    protected int lap;
    protected int lapInSecond;
    protected int amountLap;


    public CircleRunner(int lap, int lapInSecond, int amountLap) {
        super();
        this.lap = lap;
        this.lapInSecond = lapInSecond;
        this.amountLap = amountLap;
    }



    @Override
    public SportType getSportType() {
        return getSportType();
    }

    @Override
    public boolean run() {
        System.out.println("Time: " + time + ", Lap in second: " + lapInSecond + ", Amount lap: " + amountLap);
        return false;
    }


}




