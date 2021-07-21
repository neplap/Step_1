public class LongRangeRunner extends Runner{
    private int longRange;

    public LongRangeRunner(int longRange) {
        this.longRange = longRange;
    }

    public int getLongRange() {
        return longRange;
    }
    @Override
    public void getRun() {
        super.getRun();
        System.out.println("Теперь бежим вот такое расстояние: " + longRange );
    }
}
