package CodeSmells.UnPullupable2.Solution;

public class GenerateStringOfOdd extends GenerateString {
    @Override
    protected boolean isInSet(int i) {
        return i % 2 == 1;
    }
}
