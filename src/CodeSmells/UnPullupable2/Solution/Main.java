package CodeSmells.UnPullupable2.Solution;

public class Main {
    public static void main(String[] args) {
        clientCode();
    }

    // If the abstract class has only a few simple primitive operations, you can also use it as an anonymous class
    static void clientCode() {
        GenerateString gen = new GenerateString() {
            @Override
            protected boolean isInSet(int i) {
                return i % 5 == 0;
            }
        };
        System.out.println(gen.getNumbers(100));
    }
}
