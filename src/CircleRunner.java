public class CircleRunner extends Runner {
   protected int lap;

    public CircleRunner(int lap) {
        this.lap = lap;
    }


    @Override
    public void run() {
        System.out.println("Не просто бежит, а " + lap + "раз по кругу");
    }
}


