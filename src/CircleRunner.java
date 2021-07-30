public class CircleRunner extends Runner {

    protected int lapInSecond;
    protected int amountLap;


    public CircleRunner(int lapInSecond, int amountLap, int time) {
        super.time = time;
        this.lapInSecond = lapInSecond;
        this.amountLap = amountLap;
    }


    @Override
    public boolean run() {
        System.out.println("Time: " + time + ", Lap in second: " + lapInSecond + ", Amount lap: " + amountLap);
        System.out.println("Успеет ли (имя) за " + time + "сек.");
        int result1 = lapInSecond * amountLap;
        if (result1 <= time) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public SportType getSportType() {
        return SportType.CIRCLE_RUNNER;
    }


}
