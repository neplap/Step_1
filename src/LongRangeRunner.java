public class LongRangeRunner extends Runner{
    protected int longRange;

    public LongRangeRunner(int longRange) {
        this.longRange = longRange;
    }

    public int getLongRange() {
        return longRange;
    }




    @Override
    public boolean run() {
        System.out.println("Теперь бежим вот такое расстояние: " + longRange );
        return false;
    }
}
