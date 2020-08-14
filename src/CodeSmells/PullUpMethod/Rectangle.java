package CodeSmells.PullUpMethod;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        // some code…
    }
    // rest of the code…
}
