package CodeSmells.UnPullupable2.Solution;

abstract class GenerateString {

    protected abstract boolean isInSet(int i);

    public String getNumbers(int max) {
        String answer = "";
        for (int i = 0; i <= max; i++) {
            if (isInSet(i)) {
                answer += i;
            }
        }
        return answer;
    }
}
