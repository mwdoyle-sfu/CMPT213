package CodeSmells.UnPullupable.Solution;

public class IntFileProcessorProduct extends IntFileProcessor{
    @Override
    protected int getStartVal() {
        return 0;
    }
    @Override
    protected int processInt(int cur, int next) {
        return cur * next;
    }
}
