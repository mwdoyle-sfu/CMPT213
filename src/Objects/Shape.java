package Objects;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    @Override
    public int hashCode(){
        return Integer.valueOf(x).hashCode() + Integer.valueOf(y).hashCode();
    }
}
