public class LongRangeJumpRunner extends LongRangeRunner implements Jump{

    public LongRangeJumpRunner(int longRange) {
        super(longRange);
    }


    @Override
    public void jump() {
        System.out.println("Теперь прыгаем");
    }
}
