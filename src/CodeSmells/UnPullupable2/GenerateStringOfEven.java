package CodeSmells.UnPullupable2;

public class GenerateStringOfEven {
    public String getNumbers(int max) {
        String answer = "";
        for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

