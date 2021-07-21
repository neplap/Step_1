public class LongRangeRunner extends Runner{
    int longRange;

    public LongRangeRunner(int longRange) {
        this.longRange = longRange;
    }

    public int getLongRange() {
        return longRange;
    }

    @Override
    public void run() {
        System.out.println("Теперь бежим вот такое расстояние: " + longRange );
    }
}
