package CodeSmells.UnPullupable2;

public class GenerateStringOfOdd {
    public String getNumbers(int max) {
        String answer = "";
        for (int i = 0; i <= max; i++) {
            if (i % 2 == 1) {
                answer += i;
            }
        }
        return answer;
    }
}
