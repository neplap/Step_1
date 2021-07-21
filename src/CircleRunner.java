public class CircleRunner extends Runner {
    private int lap;

    public CircleRunner(int lap) {
        this.lap = lap;
    }

    @Override
    public void getRun() {
        super.getRun();
        System.out.println("Не просто бежит, а " + lap + "раз по кругу");
    }

}


