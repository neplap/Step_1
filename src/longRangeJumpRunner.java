public class longRangeJumpRunner extends LongRangeRunner implements Jump{

    public longRangeJumpRunner(int longRange) {
        super(longRange);
    }


    @Override
    public void jump() {
        System.out.println("Теперь прыгаем");
    }
}
