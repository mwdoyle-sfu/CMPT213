package CodeSmells.UnPullupable2;

public class GenerateStringOfAll {
    public String getNumbers(int max) {
        String answer = "";
        for (int i = 0; i <= max; i++) {
            if (true) {
                answer += i;
            }
        }
        return answer;
    }
}
