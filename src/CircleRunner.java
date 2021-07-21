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
        return SportType;
    }

    @Override
    public boolean run() {
        System.out.println("Time: " + timeInSecond + ", Lap in second: " + lapInSecond + ", Amount lap: " + amountLap);
        return false;
    }
    //возвращает результат вычислений (успеет ли Х за timeInSecond пробежать amountLap за lapInSecond
   //public

    //переопределенный, публичный, "получить тип", возвращает тип
    public String getSportType(String SportType) {
        return SportType;
    }

}




