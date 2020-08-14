package DesignPatterns.StrategyPattern;

interface Selector {
    boolean isInSet(int i);
}


public class GenerateString2 {
    public String getNumbers(int max, Selector selector) {
        String answer = "";
        for (int i = 0; i <= max; i++) {
            if (selector.isInSet(i)) {
                answer += i;
            }
        }
        return answer;
    }
}
