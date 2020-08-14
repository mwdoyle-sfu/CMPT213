package CodeSmells.UnPullupable2.Solution;

public class GenerateStringOfEven extends GenerateString {
    @Override
    protected boolean isInSet(int i) {
        return i % 2 == 0;
    }
}
